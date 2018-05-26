package br.com.leogsouza.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        ListItem item1 = new ListItem("The Hobbit", "It's about a hobbit journey", "Great story");
        ListItem item2 = new ListItem("Avengers 4 - Infinity War", "The best movie ever", "Unbelievable");

        listItems.add(item1);
        listItems.add(item2);


        adapter = new MyAdapter(this, listItems);
        recyclerView.setAdapter(adapter);
    }
}
