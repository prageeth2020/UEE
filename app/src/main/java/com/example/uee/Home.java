package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    ImageButton imgbuttonLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imgbuttonLogout=findViewById(R.id.imageBtnLogout);
        imgbuttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),StartScreen.class);
                startActivity(intent);
            }
        });
    }
}