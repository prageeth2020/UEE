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

public class MarkAttendence extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    LinearLayout linearLayout3;
    Button button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark_attendence);
        addItemsOnSpinner1();
        addItemsOnSpinner2();

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
        list.add("   Batch 1");
        list.add("   Batch 2");
        list.add("   Batch 3");
        list.add("   Batch 4");
        list.add("   Batch 5");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);
    }

    public void addItemsOnSpinner2() {

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add("");
        list.add("   S001");
        list.add("   S002");
        list.add("   S003");
        list.add("   S004");
        list.add("   S005");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }
}
