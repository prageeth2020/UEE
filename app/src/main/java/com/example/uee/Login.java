package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        buttonLogin=findViewById(R.id.btnLogin);
//        buttonLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(getApplicationContext(),Home.class);
//                startActivity(intent);
//            }
//        });
    }

    public void displaySuccess(View view) {
        Toast.makeText(Login.this,"Login Successfully!",Toast.LENGTH_LONG).show();
    }
}