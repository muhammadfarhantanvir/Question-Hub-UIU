package com.example.firebaseuploadexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionActivity extends AppCompatActivity {
    Button pattern;
    Button cg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        pattern = findViewById(R.id.bCSI121);        //upload question button click >>> then go the other activity

        pattern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OptionActivity.this, Pattern_Activity.class);
                startActivity(intent);

            }
        });

        cg = findViewById(R.id.button21);        //upload question button click >>> then go the other activity

        cg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OptionActivity.this, Computer_grap_Activity.class);
                startActivity(intent);

            }
        });

    }
    ////////////////////////// /<OPTIONAL 1/>/////////////////////////////////////
    public void CSI415(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1ip6vdus0rENKewuFUedLHzQsY5obaGae"));
        startActivity(browserIntent);
    }
    public void CSI421(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Gt6e4I2NLtjz94FRU-x-xLP7uwPH0Yja"));
        startActivity(browserIntent);
    }public void CSI423(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1amdNp39rD2BDLFhOm6VKhtECInTQSx7U"));
        startActivity(browserIntent);
    }public void CSI447(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1amdNp39rD2BDLFhOm6VKhtECInTQSx7U"));
        startActivity(browserIntent);
    }public void CSE427(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1amdNp39rD2BDLFhOm6VKhtECInTQSx7U"));
        startActivity(browserIntent);
    }
    public void CSE471(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1amdNp39rD2BDLFhOm6VKhtECInTQSx7U"));
        startActivity(browserIntent);
    }


    ////////////////////////// /<OPTIONAL 2/>/////////////////////////////////////
    public void CSE453(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1amdNp39rD2BDLFhOm6VKhtECInTQSx7U"));
        startActivity(browserIntent);
    }
    public void CSE457(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1amdNp39rD2BDLFhOm6VKhtECInTQSx7U"));
        startActivity(browserIntent);
    }public void CSE461(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1amdNp39rD2BDLFhOm6VKhtECInTQSx7U"));
        startActivity(browserIntent);
    }public void CSE463(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1amdNp39rD2BDLFhOm6VKhtECInTQSx7U"));
        startActivity(browserIntent);
    }public void CSE465(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1amdNp39rD2BDLFhOm6VKhtECInTQSx7U"));
        startActivity(browserIntent);
    }
    public void CSE477(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1amdNp39rD2BDLFhOm6VKhtECInTQSx7U"));
        startActivity(browserIntent);
    }public void CSE481(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1amdNp39rD2BDLFhOm6VKhtECInTQSx7U"));
        startActivity(browserIntent);
    }public void CSE487(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1amdNp39rD2BDLFhOm6VKhtECInTQSx7U"));
        startActivity(browserIntent);
    }public void CSE489(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1amdNp39rD2BDLFhOm6VKhtECInTQSx7U"));
        startActivity(browserIntent);
    }public void CSE467(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1amdNp39rD2BDLFhOm6VKhtECInTQSx7U"));
        startActivity(browserIntent);
    }
}
