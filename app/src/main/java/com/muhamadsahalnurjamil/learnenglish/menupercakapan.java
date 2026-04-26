package com.muhamadsahalnurjamil.learnenglish;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class menupercakapan extends AppCompatActivity {

    Button btnback;
    ImageView btnpercakapan1,btnpercakapan2,btnpercakapan3,btnpercakapan4,btnpercakapan5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menupercakapan);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnback = findViewById(R.id.buttonback);
        btnback.setOnClickListener(v -> {
            Intent intent = new Intent(menupercakapan.this, MainActivity.class);
            startActivity(intent);
        });

        btnpercakapan1 = findViewById(R.id.btnpercakapan1);
        btnpercakapan1.setOnClickListener(v -> {
            Intent intent = new Intent(menupercakapan.this, percakapan1.class);
            startActivity(intent);
        });

        btnpercakapan2 = findViewById(R.id.btnpercakapan2);
        btnpercakapan2.setOnClickListener(v -> {
            Intent intent = new Intent(menupercakapan.this, percakapan2.class);
            startActivity(intent);
        });

        btnpercakapan3 = findViewById(R.id.btnpercakapan3);
        btnpercakapan3.setOnClickListener(v -> {
            Intent intent = new Intent(menupercakapan.this, percakapan3.class);
            startActivity(intent);
        });

        btnpercakapan4 = findViewById(R.id.btnpercakapan4);
        btnpercakapan4.setOnClickListener(v -> {
            Intent intent = new Intent(menupercakapan.this, percakapan4.class);
            startActivity(intent);
        });

        btnpercakapan5 = findViewById(R.id.btnpercakapan5);
        btnpercakapan5.setOnClickListener(v -> {
            Intent intent = new Intent(menupercakapan.this, percakapan5.class);
            startActivity(intent);
        });
    }
}