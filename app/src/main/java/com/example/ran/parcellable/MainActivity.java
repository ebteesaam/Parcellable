package com.example.ran.parcellable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ali",18));
        students.add(new Student("Ahmed",19));
        students.add(new Student("Adel",20));
        students.add(new Student("Khaled",23));
        students.add(new Student("Karim",16));



        //TODO: Pass students list to ShowStudentActivity using put extra, Send it as ArrayList
        Intent i = new Intent(MainActivity.this,ShowStudentActivity.class);
        i.putParcelableArrayListExtra("arrayList", students);
        startActivity(i);
    }
}
