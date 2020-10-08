package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SubmitFees extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_fees);
    }

    public void showDashboard(View v){
        Toast.makeText(this, "Details Submitted Successfully", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this,FeeManagementDashboard.class);
        startActivity(i);
    }
}