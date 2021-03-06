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

public class ReportFees extends AppCompatActivity {
    private Spinner spinner1;
    LinearLayout linearLayout3;
    Button button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_fees);
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
        list.add("--Select Batch ID--");
        list.add("   B001");
        list.add("   B002");
        list.add("   B003");
        list.add("   B004");
        list.add("   B005");
        list.add("   B006");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);
    }
}