package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ViewStudentDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_student_details);
    }

    public void viewOneStudent(View v){
        Intent i = new Intent(this,OneStudentDetails.class);
        startActivity(i);
    }

    public void deleteStudent(View v){
        Toast.makeText(this, "Student Details Deleted Successfully", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this,AddNewStudent.class);
        startActivity(i);
    }
}