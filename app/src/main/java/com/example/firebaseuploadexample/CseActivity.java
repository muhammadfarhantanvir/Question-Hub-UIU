package com.example.firebaseuploadexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CseActivity extends AppCompatActivity {
    Button Circuits;
    Button Ele;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
        getSupportActionBar().setTitle("Computer Science Engineering");

        Circuits = findViewById(R.id.bCSI121);        //upload question button click >>> then go the other activity

        Circuits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CseActivity.this, Circuits_Activity.class);
                startActivity(intent);

            }
        });

        Ele = findViewById(R.id.button20);        //upload question button click >>> then go the other activity

        Ele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CseActivity.this, Circuits_Activity.class);
                startActivity(intent);

            }
        });


    }
    public void CSE225(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1T2M1kVUmuwRjLY0z2NshOcjqJTcl49aA"));
        startActivity(browserIntent);
    }public void CSE313(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1WrVGd0KZ_2JITEMRDhvU5Wny7-IZsiXK"));
        startActivity(browserIntent);
    }public void CSE315(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1crqWlHXA2GYclkkEm9yztTeHDdqPGSVp"));
        startActivity(browserIntent);
    }public void CSE323(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1YyaRxwSLU8I78uO90vTW8OABa53JMU-m"));
        startActivity(browserIntent);
    }public void CSE429(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1JvfXnifNm8MiaFC0pd2rtBDQG4ifluot"));
        startActivity(browserIntent);
    }public void CSE425(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1C6_-CtD3bOOqRAfwg9NyY50eHkkr0BRv"));
        startActivity(browserIntent);
    }
}

