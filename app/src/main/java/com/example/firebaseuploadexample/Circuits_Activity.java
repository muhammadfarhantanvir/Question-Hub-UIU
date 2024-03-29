package com.example.firebaseuploadexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Circuits_Activity extends AppCompatActivity {

    Button upload1;
    Button finalSuggestion;
    Button midSuggestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circuits_);

        finalSuggestion = findViewById(R.id.final_suggestion);        //upload question button click >>> then go the other activity

        finalSuggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Circuits_Activity.this, OcrActivity.class);
                startActivity(intent);

            }
        });


        midSuggestion = findViewById(R.id.mid_suggestion);        //upload question button click >>> then go the other activity

        midSuggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Circuits_Activity.this, OcrActivity.class);
                startActivity(intent);

            }
        });

        upload1 = findViewById(R.id.Upload);        //upload question button click >>> then go the other activity

        upload1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Circuits_Activity.this, ImageActivity.class);
                startActivity(intent);

            }
        });
    }

    public void CIRMID(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=14hqIKz-hZzbFyaGZRHqwCgYGRMXIc4pM"));
        startActivity(browserIntent);
    }
    public void CIRFINAL (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1hvUDFUk4CJlDvVBRTnAAzHVuCXFiN4lf"));
        startActivity(browserIntent);
    }

}
