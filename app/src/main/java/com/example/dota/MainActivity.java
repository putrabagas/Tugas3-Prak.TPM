package com.example.dota;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<HeroModel> listHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Hero Dota");

        rv =findViewById(R.id.rvHero);
        rv.setHasFixedSize(true);
        listHero.addAll(HeroData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rv.setLayoutManager(new LinearLayoutManager(this));
        HeroAdapter heroAdapter = new HeroAdapter(listHero,this);
        rv.setAdapter(heroAdapter);
    }
}