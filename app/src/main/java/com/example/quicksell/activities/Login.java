package com.example.quicksell.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.quicksell.R;

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Login");
    }

    public void perform_shop_login(View v){
        EditText tUsername=findViewById(R.id.editUser);
        EditText tPassword=findViewById(R.id.editPassword);
        String usern=tUsername.getText().toString();
        String passw=tPassword.getText().toString();

        if(usern.equals("shop1")&&passw.equals("123")){
            Intent intent = new Intent(Login.this, WelcomeShop.class);
            startActivity(intent);


        }
        // Intent intent=new Intent(HomePage.this,)


    }


}
