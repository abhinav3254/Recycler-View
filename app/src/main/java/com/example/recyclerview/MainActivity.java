package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();

    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.onegirl,"Anjali","How are you ?","18:02","----------------"));
        userList.add(new ModelClass(R.drawable.twogirl,"Kriti","wanna hangout ?","00:55","----------------"));
        userList.add(new ModelClass(R.drawable.threegirl,"Komal","netflix and chill ?","13:08","----------------"));
        userList.add(new ModelClass(R.drawable.oneboy,"rahul","Let's make an app","06:05","----------------"));
        userList.add(new ModelClass(R.drawable.onegirl,"kailash","found yeah","08:10","----------------"));
        userList.add(new ModelClass(R.drawable.onegirl,"Anjali","How are you ?","18:02","----------------"));
        userList.add(new ModelClass(R.drawable.twogirl,"Kriti","wanna hangout ?","00:55","----------------"));
        userList.add(new ModelClass(R.drawable.threegirl,"Komal","netflix and chill ?","13:08","----------------"));
        userList.add(new ModelClass(R.drawable.oneboy,"rahul","Let's make an app","06:05","----------------"));
        userList.add(new ModelClass(R.drawable.onegirl,"kailash","found yeah","08:10","----------------"));userList.add(new ModelClass(R.drawable.onegirl,"Anjali","How are you ?","18:02","----------------"));
        userList.add(new ModelClass(R.drawable.twogirl,"Kriti","wanna hangout ?","00:55","----------------"));
        userList.add(new ModelClass(R.drawable.threegirl,"Komal","netflix and chill ?","13:08","----------------"));
        userList.add(new ModelClass(R.drawable.oneboy,"rahul","Let's make an app","06:05","----------------"));
        userList.add(new ModelClass(R.drawable.onegirl,"kailash","found yeah","08:10","----------------"));userList.add(new ModelClass(R.drawable.onegirl,"Anjali","How are you ?","18:02","----------------"));
        userList.add(new ModelClass(R.drawable.twogirl,"Kriti","wanna hangout ?","00:55","----------------"));
        userList.add(new ModelClass(R.drawable.threegirl,"Komal","netflix and chill ?","13:08","----------------"));
        userList.add(new ModelClass(R.drawable.oneboy,"rahul","Let's make an app","06:05","----------------"));
        userList.add(new ModelClass(R.drawable.onegirl,"kailash","found yeah","08:10","----------------"));userList.add(new ModelClass(R.drawable.onegirl,"Anjali","How are you ?","18:02","----------------"));
        userList.add(new ModelClass(R.drawable.twogirl,"Kriti","wanna hangout ?","00:55","----------------"));
        userList.add(new ModelClass(R.drawable.threegirl,"Komal","netflix and chill ?","13:08","----------------"));
        userList.add(new ModelClass(R.drawable.oneboy,"rahul","Let's make an app","06:05","----------------"));
        userList.add(new ModelClass(R.drawable.onegirl,"kailash","found yeah","08:10","----------------"));
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}