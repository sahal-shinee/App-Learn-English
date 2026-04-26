package com.muhamadsahalnurjamil.learnenglish;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class menukosakata extends AppCompatActivity {

    Button btnback;
    ImageView btnfamily, btncolor, btnprofesi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menukosakata);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnfamily = findViewById(R.id.btnfamily);
        btnfamily.setOnClickListener(v -> {
            startActivity(new Intent(menukosakata.this, kosakatafamily.class));
            finish();
        });

        btncolor = findViewById(R.id.btncolor);
        btncolor.setOnClickListener(v -> {
            startActivity(new Intent(menukosakata.this, kosakatacolor.class));
            finish();
        });

        btnprofesi = findViewById(R.id.btnprofesi);
        btnprofesi.setOnClickListener(v -> {
            startActivity(new Intent(menukosakata.this, kosakataprofesi.class));
            finish();
        });

        btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(v -> {
            startActivity(new Intent(menukosakata.this, MainActivity.class));
            finish();
        });
    }
}