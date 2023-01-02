package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class BottomActivity extends AppCompatActivity {

    MaterialButton country_btn;

    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        country_btn = findViewById(R.id.country_btn);


        list = new ArrayList<>();

        list.add("India");
        list.add("USA");
        list.add("United Kingdom");
        list.add("France");
        list.add("China");
        list.add("Japan");
        list.add("Vietnam");


    }
}