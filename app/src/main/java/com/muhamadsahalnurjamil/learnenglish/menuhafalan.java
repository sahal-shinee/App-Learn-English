package com.muhamadsahalnurjamil.learnenglish;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class menuhafalan extends AppCompatActivity {

    ImageButton btnhafalan1, btnhafalan2, btnhafalan3, btnhafalan4, btnhafalan5;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menuhafalan);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnhafalan1 = findViewById(R.id.btnhafalan1);
        btnhafalan1.setOnClickListener(v -> {
            startActivity(new Intent(menuhafalan.this, hafalan1.class));
            finish();
        });

        btnhafalan2 = findViewById(R.id.btnhafalan2);
        btnhafalan2.setOnClickListener(v -> {
            startActivity(new Intent(menuhafalan.this, hafalan2.class));
            finish();
        });

        btnhafalan3 = findViewById(R.id.btnhafalan3);
        btnhafalan3.setOnClickListener(v -> {
            startActivity(new Intent(menuhafalan.this, hafalan3.class));
            finish();
        });

        btnhafalan4 = findViewById(R.id.btnhafalan4);
        btnhafalan4.setOnClickListener(v -> {
            startActivity(new Intent(menuhafalan.this, hafalan4.class));
            finish();
        });

        btnhafalan5 = findViewById(R.id.btnhafalan5);
        btnhafalan5.setOnClickListener(v -> {
            startActivity(new Intent(menuhafalan.this, hafalan5.class));
            finish();
        });

        btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(v -> {
            startActivity(new Intent(menuhafalan.this, MainActivity.class));
            finish();
        });

    }
}