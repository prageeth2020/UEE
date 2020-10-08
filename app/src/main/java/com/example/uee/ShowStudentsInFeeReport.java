package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ShowStudentsInFeeReport extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    Button button16;
    LinearLayout linearLayout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_students_in_fee_report);
        addItemsOnSpinner1();
        addItemsOnSpinner2();
        button16 = findViewById(R.id.button16);
        linearLayout3 = findViewById(R.id.linearLayout3);



        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(linearLayout3.getVisibility()==View.VISIBLE){
                    linearLayout3.setVisibility(View.GONE);
                }else{
                    linearLayout3.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void showFeeReport(View v){
        Intent i = new Intent(this,FeeReport.class);
        startActivity(i);
    }

    public void addItemsOnSpinner1() {

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        List<String> list = new ArrayList<String>();
        list.add("");
        list.add("B001");
        list.add("B002");
        list.add("B003");
        list.add("B004");
        list.add("B005");
        list.add("B006");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);
    }

    public void addItemsOnSpinner2() {

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add("");
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("October");
        list.add("November");
        list.add("December");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }
}