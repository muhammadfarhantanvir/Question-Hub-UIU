package com.example.firebaseuploadexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button m1;
    Button m2;
    Button m3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1 = findViewById(R.id.bCSE);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IF2Activity.class);
                startActivity(intent);

            }
        });

        m2 = findViewById(R.id.bEEE);

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EeeActivity.class);
                startActivity(intent);

            }
        });
        m3 = findViewById(R.id.bBBA);
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BbaActivity.class);
                startActivity(intent);

            }
        });
    }
}
