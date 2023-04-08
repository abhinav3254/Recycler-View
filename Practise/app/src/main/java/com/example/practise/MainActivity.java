package com.example.practise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.practise.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        List<Pojo> list = putList();
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter adapter = new CustomAdapter(list,this);
        binding.recyclerView.setAdapter(adapter);
    }
    public List<Pojo> putList() {
        List<Pojo> list = new ArrayList<>();
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        list.add(new Pojo("This is Android Development"));
        return list;
    }
}