package com.example.tugas7_anisahasna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    String[] obat = {
            "Panadol", "Paramex", "Promaag", "Mylanta", "Vitacimin",
            "Tolak Angin", "Antangin", "Bodrex", "OBH", "Redoxon",
    };
    Integer[] jumlah = {
            10, 8, 2, 20, 5,
            3, 12, 1, 16, 6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        recyclerView = findViewById(R.id.recyclerView);
        recylerViewLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerViewAdapter = new AdapterRecyclerView(context, obat, jumlah);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}