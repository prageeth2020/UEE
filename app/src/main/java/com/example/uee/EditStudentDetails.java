package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EditStudentDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_student_details);
    }

    public void viewStudent(View v){
        Toast.makeText(this, "Student Details Updated Successfully", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this,ViewStudentDetails.class);
        startActivity(i);
    }
}