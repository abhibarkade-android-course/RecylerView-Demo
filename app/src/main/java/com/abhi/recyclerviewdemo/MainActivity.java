package com.abhi.recyclerviewdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        CustomData[] list = new CustomData[]{
                new CustomData("January"),
                new CustomData("February"),
                new CustomData("March"),
                new CustomData("April"),
                new CustomData("May"),
                new CustomData("June"),
                new CustomData("July"),
                new CustomData("August"),
                new CustomData("September"),
                new CustomData("October"),
                new CustomData("November"),
                new CustomData("December"),
                new CustomData("January"),
                new CustomData("February"),
                new CustomData("March"),
                new CustomData("April"),
                new CustomData("May"),
                new CustomData("June"),
                new CustomData("July"),
                new CustomData("August"),
                new CustomData("September"),
                new CustomData("October"),
                new CustomData("November"),
                new CustomData("December")
        };

        RecyclerAdapter adapter = new RecyclerAdapter(list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}