package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ExpensesIncomesDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses_incomes_dashboard);
    }

    public void showExpenses(View v){
        Intent i = new Intent(this,Expenses.class);
        startActivity(i);
    }

    public void showIncomes(View v){
        Intent i = new Intent(this,Incomes.class);
        startActivity(i);
    }
}