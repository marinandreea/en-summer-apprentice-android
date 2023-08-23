package com.endava.ticketmanagementsystem;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_activity);

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

    }
}
