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

public class ReportIncome extends AppCompatActivity {
    private Spinner spinner1;
    LinearLayout linearLayout3;
    Button button16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_income);
        addItemsOnSpinner1();

        button16 = findViewById(R.id.button16);
        linearLayout3 = findViewById(R.id.tableLayout);

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


    public void addItemsOnSpinner1() {

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        List<String> list = new ArrayList<String>();
        list.add("");
        list.add("   T001");
        list.add("   T002");
        list.add("   T003");
        list.add("   T004");
        list.add("   T005");
        list.add("   T006");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);
    }
}