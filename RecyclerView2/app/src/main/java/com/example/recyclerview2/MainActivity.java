package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.recyclerview2.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        List<ModalClass> list = getList();

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
         binding.recyclerView.setAdapter(new AdapterClass(list));
    }

    public List<ModalClass> getList () {
        List<ModalClass> list = new ArrayList<>();

        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));
        list.add(new ModalClass(R.drawable.girl1,"Anjali","Hii....","14:24"));

        return list;
    }
}