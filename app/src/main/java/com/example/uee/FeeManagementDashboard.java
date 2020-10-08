package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FeeManagementDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee_management_dashboard);
    }

    public void showStudents(View v){
        Intent i = new Intent(this,ShowStudents.class);
        startActivity(i);
    }

    public void showFeeReport(View v){
        Intent i = new Intent(this,ShowStudentsInFeeReport.class);
        startActivity(i);
    }

    public void showFeeReminder(View v){
        Intent i = new Intent(this,ShowStudentsInFeeReminder.class);
        startActivity(i);
    }
}