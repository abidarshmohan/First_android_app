package com.example.department;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;

import android.os.Bundle;

public class notice extends AppCompatActivity {
    Button btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
        btn12 = findViewById(R.id.button12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(notice.this, "uploaded successfullty", Toast.LENGTH_SHORT).show();
            }
        });
    }
}