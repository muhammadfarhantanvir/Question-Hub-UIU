package com.example.firebaseuploadexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IF2Activity extends AppCompatActivity {

    Button cse;
    Button csi;
    Button math;
    Button option;
    Button other;
    Button upload1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if2);
        getSupportActionBar().setTitle("Which one you need?");

        cse = findViewById(R.id.bcse);      //cse button click >>> then go the cse activity

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IF2Activity.this,CseActivity.class);
                startActivity(intent);

            }
        });

        csi = findViewById(R.id.bcsi);      //csi button click >>> then go the csi activity

        csi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IF2Activity.this,CsiActivity.class);
                startActivity(intent);

            }
        });

        option = findViewById(R.id.boption);        //other button click >>> then go the other activity

        option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IF2Activity.this, OptionActivity.class);
                startActivity(intent);

            }
        });

        math = findViewById(R.id.bmath);    //math button click >>> then go the math activity

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IF2Activity.this,MathActivity.class);
                startActivity(intent);

            }
        });

        other = findViewById(R.id.bother);        //other button click >>> then go the other activity

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IF2Activity.this, OtherActivity.class);
                startActivity(intent);

            }
        });

        upload1 = findViewById(R.id.upload1);        //other button click >>> then go the other activity

        upload1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IF2Activity.this, ImageActivity.class);
                startActivity(intent);

            }
        });


    }

}

