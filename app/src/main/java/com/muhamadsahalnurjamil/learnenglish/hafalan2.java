package com.muhamadsahalnurjamil.learnenglish;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class hafalan2 extends AppCompatActivity {

    Button btnback;
    ImageView suara1, suara2, suara3, suara4, suara5;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hafalan2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(v -> {
            startActivity(new Intent(hafalan2.this, menuhafalan.class));
            finish();
        });

        suara1 = (ImageView) findViewById(R.id.suara1);
        suara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(hafalan2.this, R.raw.understand);
                mp.start();
            }
        });

        suara2 = (ImageView) findViewById(R.id.suara2);
        suara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(hafalan2.this, R.raw.whatdoyou);
                mp.start();
            }
        });

        suara3 = (ImageView) findViewById(R.id.suara3);
        suara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(hafalan2.this, R.raw.sorry);
                mp.start();
            }
        });

        suara4 = (ImageView) findViewById(R.id.suara4);
        suara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(hafalan2.this, R.raw.thankyou);
                mp.start();
            }
        });

        suara5 = (ImageView) findViewById(R.id.suara5);
        suara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(hafalan2.this, R.raw.youwelcome);
                mp.start();
            }
        });


    }
}