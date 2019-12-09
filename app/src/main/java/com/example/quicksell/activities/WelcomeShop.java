package com.example.quicksell.activities;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.quicksell.R;

public class WelcomeShop extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_welcome_shop);
        GridLayout gridLayout = (GridLayout) findViewById(R.id.grid1);
//        gridLayout.setColumnCount(3);
  //      gridLayout.setRowCount(2);
        Toolbar myToolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        setTitle("QuickSell");
        ViewGroup view=(ViewGroup)findViewById(R.id.grid1);
        addDynamicView(view);
    }
    public void addDynamicView(ViewGroup root){
        GridView gridLayout =(GridView) findViewById(R.id.grid1);
       // GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
        //layoutParams.height = GridLayout.LayoutParams.MATCH_PARENT;
        //layoutParams.width = GridLayout.LayoutParams.MATCH_PARENT;
        //layoutParams.setMargins(10, 10, 10, 10);
      //  gridLayout.setLayoutParams(layoutParams);

        TextView tx=new TextView(getApplicationContext());
        tx.setText("place");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.gridlayout_dynamic);

        gridLayout.setAdapter(adapter);





    }


}
