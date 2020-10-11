package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Incomes extends AppCompatActivity {
    private Spinner spinner4, spinner2;
    Button button16;
    LinearLayout linearLayout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incomes);
        addItemsOnSpinner2();
        addItemsOnSpinner4();
        button16 = findViewById(R.id.button2);
        linearLayout3 = findViewById(R.id.layout1);

        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(linearLayout3.getVisibility()==View.VISIBLE){
                    linearLayout3.setVisibility(View.GONE);
                    button16.setText("Show Expenses");
                }else{
                    linearLayout3.setVisibility(View.VISIBLE);
                    button16.setText("Clear");
                }
            }
        });
    }

    public void addItemsOnSpinner2() {

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add("");
        list.add("2015");
        list.add("2016");
        list.add("2017");
        list.add("2018");
        list.add("2019");
        list.add("2020");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }

    public void addItemsOnSpinner4() {

        spinner4 = (Spinner) findViewById(R.id.spinner4);
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
        spinner4.setAdapter(dataAdapter);
    }

}