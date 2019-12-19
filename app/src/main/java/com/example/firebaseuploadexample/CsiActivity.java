package com.example.firebaseuploadexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CsiActivity extends AppCompatActivity {
    Button spl;
    Button oop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csi);
        getSupportActionBar().setTitle("Computer Science and Information");

        spl = findViewById(R.id.bCSI121);        //upload question button click >>> then go the other activity

        spl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CsiActivity.this, SPL_Activity.class);
                startActivity(intent);

            }
        });

        oop = findViewById(R.id.button20);        //upload question button click >>> then go the other activity

        oop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CsiActivity.this, OOPActivity.class);
                startActivity(intent);

            }
        });
    }

    public void CSI121(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1AK0vQR--HI5Yhr-l1KTVn0OeLeNjbrT4"));
        startActivity(browserIntent);
    }
    public void CSI211(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1rcoZkVfIRMkPxc8Qyrl39NrLk0fknYW_"));
        startActivity(browserIntent);
    }public void CSI217(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1KnKdhJJJuHWTTZmc8Tsm_5K3dM3kkErg"));
        startActivity(browserIntent);
    }public void CSI219(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1TTRT4yDg-MEwBgp5G_mCwAdNVhtNIuzf"));
        startActivity(browserIntent);
    }public void CSI221(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1jXNVjLqGjY4u1tYR4udJgIhHvhPpYK2A"));
        startActivity(browserIntent);
    }public void CSI227(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Knrc-TJsHu4lMNehB3ixlHefir9bfv1S"));
        startActivity(browserIntent);
    }public void CSI229(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1dRjfTyUncfA1sGwGAq41uwzlGcIpLHLS"));
        startActivity(browserIntent);
    }public void CSI233(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1S2uf0Dj83CB8uoLLycIeSDBuCWfL7rEf"));
        startActivity(browserIntent);
    }public void CSI309(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1yJOo8esgt5cFXSRY9sHcE0MymAPwNS4_"));
        startActivity(browserIntent);
    }public void CSI311(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1rovvCdYTBDYeKnNICYZV5p6UlrEK4gBn"));
        startActivity(browserIntent);
    }public void CSI321(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1m5ELNGgJEKYYTpq4RQT8ahAlCL4AyQ7S"));
        startActivity(browserIntent);
    }public void CSI341(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1S6355odJ9tGqz4_Blevp7F1tR9SoyrPr"));
        startActivity(browserIntent);
    }public void CSI411(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Jz3-9kH0szLGhjMuPqLp7z94NCTVvdrs"));
        startActivity(browserIntent);
    }
}

