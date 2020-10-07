package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button buttonLogin;
    TextView linkRegister,linkForgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonLogin=findViewById(R.id.btnLogin);
        linkRegister=findViewById(R.id.linkReg);
        linkForgot=findViewById(R.id.linkForgotPw);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Home.class);
                startActivity(intent);
            }
        });

        linkRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent=new Intent(getApplicationContext(),Register.class);
                startActivity(registerIntent);
            }
        });

        linkForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotIntent=new Intent(getApplicationContext(),ForgotPassword.class);
                startActivity(forgotIntent);
            }
        });
    }

    public void displaySuccess(View view) {
        Toast.makeText(Login.this,"Login Successfully!",Toast.LENGTH_LONG).show();
    }
}