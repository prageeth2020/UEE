package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AddNewStudent extends AppCompatActivity {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_student);
        addItemsOnSpinner();
    }

    public void addItemsOnSpinner() {

        spinner = (Spinner) findViewById(R.id.spinner);
        List<String> list = new ArrayList<String>();
        list.add("");
        list.add("Batch 1");
        list.add("Batch 2");
        list.add("Batch 3");
        list.add("Batch 4");
        list.add("Batch 5");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }

    public void viewStudent(View v){
        Intent i = new Intent(this,ViewStudentDetails.class);
        startActivity(i);
    }

    public void addStudent(View v){
        Toast.makeText(this, "Student Details Added Successfully", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this,ViewStudentDetails.class);
        startActivity(i);
    }
}