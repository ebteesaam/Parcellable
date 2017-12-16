package com.example.ran.parcellable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ShowStudentActivity extends AppCompatActivity {
    ArrayList<Student>st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_student);

        Intent i =getIntent();

        st = i.getParcelableArrayListExtra("arrayList");
        ListView listView=(ListView)findViewById(R.id.listview);
        listView.setAdapter(new ArrayListAdapter(this,st));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent=new Intent();
                intent.putExtra("name",st.get(i).getName());
            }
        });
        //LayoutInflater.from(this).inflate(R.layout.item,listView);

        //TODO receive the list and show a list view of student
        //ArrayList<Student> students = getIntent().getParcelableArrayListExtra("arrayList");
    }



    }
