package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EditBatchDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_batch_details);
    }

    public void viewBatch(View v){
        Toast.makeText(this, "Batch Details Updated Successfully", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this,ViewBatchDetails.class);
        startActivity(i);
    }
}