package com.example.firebaseuploadexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OtherActivity extends AppCompatActivity {
    Button phy;
    Button acc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        getSupportActionBar().setTitle("OTHER");

        phy = findViewById(R.id.bCSI121);        //upload question button click >>> then go the other activity

        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherActivity.this, Phy_Activity.class);
                startActivity(intent);

            }
        });

        acc = findViewById(R.id.button21);        //upload question button click >>> then go the other activity

        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherActivity.this, Accounting_Activity.class);
                startActivity(intent);

            }
        });

    }

    public void PHY105(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1V2jo9hs0v8NA6Chlb2wJ04v-E024MH1z"));
        startActivity(browserIntent);
    }public void ACT111(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1vSlWvQ1hVot_yZaWEUqSIGKDuzaSo8VT"));
        startActivity(browserIntent);
    }public void ECO213(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1vzNAmO-V8542_-iLryPJ5H1FQSZhXObK"));
        startActivity(browserIntent);
    }public void IPE401(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1HQALJtXqNkwy1W1jJ2lxIi3F7ta0pvq4"));
        startActivity(browserIntent);
    }
}
