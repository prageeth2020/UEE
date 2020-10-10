package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ViewBatchDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_batch_details);
    }
    public void editBatch(View v){
        Intent i = new Intent(this,EditBatchDetails.class);
        startActivity(i);
    }

    public void oneBatch(View v){
        Intent i = new Intent(this,OneBatchDetail.class);
        startActivity(i);
    }

    public void deleteBatch(View v){
        Toast.makeText(this, "Batch Details Deleted Successfully", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this,AddNewBatch.class);
        startActivity(i);
    }
}