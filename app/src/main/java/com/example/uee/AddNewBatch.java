package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AddNewBatch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_batch);
    }

    public void viewBatch(View v){
        Intent i = new Intent(this,ViewBatchDetails.class);
        startActivity(i);
    }

    public void addBatch(View v){
        Toast.makeText(this, "Batch Details Added Successfully", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this,ViewBatchDetails.class);
        startActivity(i);
    }

}