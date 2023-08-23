package com.endava.ticketmanagementsystem;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    ArrayList<EventModel> eventModels = new ArrayList<>();
//    int[] images = {R.drawable.untold,R.drawable.ec};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Găsim butonul "orders" și adăugăm un listener pentru evenimentul de apăsare
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button ordersButton = findViewById(R.id.orders);
        ordersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Deschidem OrderActivity când butonul este apăsat
                Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                startActivity(intent);
            }
        });



//        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView recyclerView = findViewById(R.id.mRecyclerView);
//
//        setUpEventsModels();
//
//        E_RecyclerViewAdapter adapter = new E_RecyclerViewAdapter(this,eventModels);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }



//    private void setUpEventsModels(){
//        String[] description = {"FESTIVAL" , "FESTIVAL"};
//        for(int i=0;i<description.length;i++){
//            eventModels.add(new EventModel(description[i],images[i]));
//        }
//    }
}
