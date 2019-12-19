package com.example.firebaseuploadexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MathActivity extends AppCompatActivity {
    Button math003;
    Button math151;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        math003 = findViewById(R.id.bCSI121);        //upload question button click >>> then go the other activity

        math003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MathActivity.this, Circuits_Activity.class);
                startActivity(intent);

            }
        });

        math151 = findViewById(R.id.button20);        //upload question button click >>> then go the other activity

        math151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MathActivity.this, Circuits_Activity.class);
                startActivity(intent);

            }
        });

    }

    public void MATH003(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1w9OyFR-JvCpU_1kQy8hecFWwdKmKvUCV"));
        startActivity(browserIntent);
    }
    public void MATH151(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1UIsekXfZNVv0wqcDdk85DWx40ogtXCdE"));
        startActivity(browserIntent);
    }public void MATH183(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1EVzrKw2pqyEGxT6f5ay0gEwPESteWBC1"));
        startActivity(browserIntent);
    }public void MATH187(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=12EU1O1wC74g6oFdNPzESgLwX-wfSY_N4"));
        startActivity(browserIntent);
    }public void MATH201(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1N1EruPN3x7QBgjxmLXhDVekmn_6Hqr9P"));
        startActivity(browserIntent);
    }public void STAT205(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1to23b3ZfKa0A3F7etBm0iBDWICxhGM-o"));
        startActivity(browserIntent);
    }
}

