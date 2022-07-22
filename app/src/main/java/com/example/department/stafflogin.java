package com.example.department;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class stafflogin extends AppCompatActivity {
    EditText name,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stafflogin);
        EditText name = findViewById(R.id.name);
        EditText password = findViewById(R.id.Password);
        Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().equals("admin") && password.getText().toString().equals("password")) {
                    Toast.makeText(stafflogin.this, "Login successfully", Toast.LENGTH_SHORT).show();
                    login.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(stafflogin.this,dashboard.class);
                            startActivity(intent);
                        }
                    });
                }
                else {
                    Toast.makeText(stafflogin.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}