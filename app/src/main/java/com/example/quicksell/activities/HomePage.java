package com.example.quicksell.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.quicksell.R;



public class HomePage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
       // final TextView edtTxt1=findViewById(R.id.textView2);
    }

   //Upload photo
    public void perform_action(View v)
    {
       // Intent intent=new Intent(HomePage.this, FillAddress.class);
        Intent intent=new Intent(HomePage.this, UploadPhoto.class);
        startActivity(intent);
    }

   //login for shops
    public void perform_action_login(View v) {

        Intent intent = new Intent(HomePage.this, Login.class);
        startActivity(intent);
    }

    }
