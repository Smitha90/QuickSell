package com.example.quicksell.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.quicksell.R;

public class UploadPhoto extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uploadphoto);

        Toolbar myToolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        setTitle("Sell Product");
      //  myToolbar.setMenu(R.menu.upload_menu,);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu, this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.upload_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.activities:
                Intent intent=new Intent(UploadPhoto.this,ActivityProgress.class);
                        startActivity(intent);
                ;
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }





    // final ImageButton imgButt=findViewById(R.id.imageButton);
    // imgButt.set


    public void perform_action_gallery(View view) {
        final int REQUEST_GALLERY = 0;
        String[] mimeTypes = {"image/jpeg", "image/png"};

        Intent galleryIntent = new Intent(
                Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        galleryIntent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes);
        startActivityForResult(galleryIntent, REQUEST_GALLERY);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Result code is RESULT_OK only if the user selects an Image
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK)
            switch (requestCode) {
                case 0:
                    //data.getData returns the content URI for the selected Image
                    Uri selectedImage = data.getData();
                    ImageView imgView = findViewById(R.id.furImage);
                    imgView.setVisibility(View.VISIBLE);
                    imgView.setImageURI(selectedImage);

                    TextView tv = findViewById(R.id.imageText);
                    tv.setVisibility(View.VISIBLE);

                    TextView txt = findViewById(R.id.textSucces);
                    txt.setVisibility(View.VISIBLE);

                 /*   ImageView imgv = findViewById(R.id.deleteImg);
                    imgv.setVisibility(View.VISIBLE);*/

                    Button bt = findViewById(R.id.uploadButt);
                    bt.setVisibility(View.INVISIBLE);

                    Button bt2 = findViewById(R.id.anotherProduct);
                    bt2.setVisibility(View.VISIBLE);
                    break;
            }
    }

    /*public void createLayout(View view) {

        final GridLayout gridLayout = (GridLayout)(R.id.Grid1);
    }*/
}

