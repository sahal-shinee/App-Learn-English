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

public class menucerita extends AppCompatActivity {

    Button btnback;
    ImageView btncerita1, btncerita2, btncerita3, btncerita4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menucerita);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(v -> {
            startActivity(new Intent(menucerita.this, MainActivity.class));
            finish();
        });

        btncerita1 = findViewById(R.id.btncerita1);
        btncerita1.setOnClickListener(v -> {
            startActivity(new Intent(menucerita.this, cerita1.class));
            finish();
        });

        btncerita2 = findViewById(R.id.btncerita2);
        btncerita2.setOnClickListener(v -> {
            startActivity(new Intent(menucerita.this, cerita2.class));
            finish();
        });

        btncerita3 = findViewById(R.id.btncerita3);
        btncerita3.setOnClickListener(v -> {
            startActivity(new Intent(menucerita.this, cerita3.class));
            finish();
        });

        btncerita4 = findViewById(R.id.btncerita4);
        btncerita4.setOnClickListener(v -> {
            startActivity(new Intent(menucerita.this, cerita4.class));
            finish();
        });
    }
}