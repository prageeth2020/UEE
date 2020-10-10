package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Reports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);
    }

    public void showAttendanceReport(View v){
        Toast.makeText(this, "Attendance Report", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this,ReportAttendance.class);
        startActivity(i);
    }

    public void showFeesReport(View v){
        Toast.makeText(this, "Fees Report", Toast.LENGTH_LONG).show();

        Intent i = new Intent(this,ReportFees.class);
        startActivity(i);
    }

    public void showIncomeReport(View v){
        Toast.makeText(this, "Incomes Report", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this,ReportIncome.class);
        startActivity(i);
    }

    public void showExpenseReport(View v){
        Toast.makeText(this, "Expenses Report", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this,ReportExpenses.class);
        startActivity(i);
    }
}