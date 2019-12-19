package com.example.firebaseuploadexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Computer_grap_Activity extends AppCompatActivity {

    Button upload1;
    Button finalSuggestion;
    Button midSuggestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_grap_);

        finalSuggestion = findViewById(R.id.final_suggestion);        //upload question button click >>> then go the other activity

        finalSuggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Computer_grap_Activity.this, OcrActivity.class);
                startActivity(intent);

            }
        });


        midSuggestion = findViewById(R.id.mid_suggestion);        //upload question button click >>> then go the other activity

        midSuggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Computer_grap_Activity.this, OcrActivity.class);
                startActivity(intent);

            }
        });

        upload1 = findViewById(R.id.Upload);        //upload question button click >>> then go the other activity

        upload1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Computer_grap_Activity.this, ImageActivity.class);
                startActivity(intent);

            }
        });

    }

    public void CGMID(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1ueNO_K-d0sV0eCWUzg8jBg80hotMIb_y"));
        startActivity(browserIntent);
    }
    public void CGFINAL(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1ueNO_K-d0sV0eCWUzg8jBg80hotMIb_y"));
        startActivity(browserIntent);
    }

}
