package com.example.firebaseuploadexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OOPActivity extends AppCompatActivity {

    Button upload1;
    Button finalSuggestion;
    Button midSuggestion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop);

        finalSuggestion = findViewById(R.id.final_suggestion);        //upload question button click >>> then go the other activity

        finalSuggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OOPActivity.this, OcrActivity.class);
                startActivity(intent);

            }
        });


        midSuggestion = findViewById(R.id.mid_suggestion);        //upload question button click >>> then go the other activity

        midSuggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OOPActivity.this, OcrActivity.class);
                startActivity(intent);

            }
        });

        upload1 = findViewById(R.id.Upload);        //upload question button click >>> then go the other activity

        upload1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OOPActivity.this, ImageActivity.class);
                startActivity(intent);

            }
        });
    }

    public void OOPMID(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1p4YsmH25VF7kxNfO9PlqzX_PT6XVbSIP"));
        startActivity(browserIntent);
    }
    public void OOPFINAL(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1h-IjNZiPy-rldhk7K11VaLvcHASMkPfQ"));
        startActivity(browserIntent);
    }

}
