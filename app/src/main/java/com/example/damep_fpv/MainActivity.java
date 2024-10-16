package com.example.damep_fpv;

import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.ButtonCrear);
        btn1.setOnClickListener(view -> Toast.makeText(this, "Redireccionando a crear cuenta...", Toast.LENGTH_SHORT).show());



        setContentView(R.layout.activity_main);
        Button btn2 = findViewById(R.id.ButtonIngresar);
        btn2.setOnClickListener(view -> Toast.makeText(this, "Ingresando a su cuenta...", Toast.LENGTH_SHORT).show());



    }
}