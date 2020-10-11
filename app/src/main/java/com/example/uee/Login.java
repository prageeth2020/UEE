package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Login extends AppCompatActivity {

    FloatingActionButton buttonLogin;
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
                Toast.makeText(Login.this,"Login Successfully!",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
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