package com.muhamadsahalnurjamil.learnenglish;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnhafalan, btnkosakata, btncerita, btnpercakapan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnhafalan = findViewById(R.id.btnhafalan);
        btnhafalan.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, menuhafalan.class));
            finish();
        });

        btnpercakapan= findViewById(R.id.btnpercakapan);
        btnpercakapan.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, menupercakapan.class));
            finish();
        });

        btnkosakata = findViewById(R.id.btnkosakata);
        btnkosakata.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, menukosakata.class));
            finish();
        });

        btncerita = findViewById(R.id.btncerita);
        btncerita.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, menucerita.class));
            finish();
        });

    }
}