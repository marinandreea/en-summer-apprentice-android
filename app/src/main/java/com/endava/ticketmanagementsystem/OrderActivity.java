package com.endava.ticketmanagementsystem;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity);

        // Find the MaterialToolbar
        Toolbar topAppBar = findViewById(R.id.topAppBar);


        // Set an OnClickListener for the navigation icon
        topAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the navigation icon click here
                // For example, navigate to MainActivity
                onBackPressed(); // This will simulate the back button press and navigate to MainActivity
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button ordersButton = findViewById(R.id.editButton1);
        ordersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Deschidem EditActivity când butonul este apăsat
                Intent intent = new Intent(OrderActivity.this, EditActivity.class);
                startActivity(intent);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button ordersButton2 = findViewById(R.id.editButton2);
        ordersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Deschidem EditActivity când butonul este apăsat
                Intent intent = new Intent(OrderActivity.this, EditActivity.class);
                startActivity(intent);
            }
        });
    }
}
