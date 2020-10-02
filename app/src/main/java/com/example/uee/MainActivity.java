package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showFeeManagement(View v){
        Intent i = new Intent(this,FeeManagementDashboard.class);
        startActivity(i);
    }

    public void showExpensesAndIncomes(View v){
        Intent i = new Intent(this,ExpensesIncomesDashboard.class);
        startActivity(i);
    }

    public void showReports(View v){
        Intent i = new Intent(this,Reports.class);
        startActivity(i);
    }

    public void showAddNewBatch(View v){
        Intent i = new Intent(this,AddNewBatch.class);
        startActivity(i);
    }

    public void showAddNewStudent(View v){
        Intent i = new Intent(this,AddNewStudent.class);
        startActivity(i);
    }
}
