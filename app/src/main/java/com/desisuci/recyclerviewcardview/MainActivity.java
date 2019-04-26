package com.desisuci.recyclerviewcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

        private RecyclerView recyclerView;
        private MahasiswaAdapter adapter;
        private ArrayList<Mahasiswa> mahasiswaArrayList;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            addData();

            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

            adapter = new MahasiswaAdapter(mahasiswaArrayList);

            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

            recyclerView.setLayoutManager(layoutManager);

            recyclerView.setAdapter(adapter);
        }

        void addData(){
            mahasiswaArrayList = new ArrayList<>();
            mahasiswaArrayList.add(new Mahasiswa("Desi Suci Ramadhani", "1414370309", "089519725626"));
            mahasiswaArrayList.add(new Mahasiswa("Azka Afkara", "1214234560", "087877973262"));
            mahasiswaArrayList.add(new Mahasiswa("Keyra Renata Shanum", "1214230345", "085611541328"));
            mahasiswaArrayList.add(new Mahasiswa("Rayyan Alfaridzi", "1214378098", "0811548815261"));
        }

    }
