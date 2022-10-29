package com.asrinhaktan.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button giris_yap;
    public Button pgiris_yap;
    public Button mgiris_yap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        giris_yap = (Button)findViewById(R.id.giris);
        pgiris_yap = (Button)findViewById(R.id.pgiris);
        mgiris_yap = (Button)findViewById(R.id.mgiris);

        giris_yap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent girisYap = new Intent(MainActivity.this, kullGiris.class);
                startActivity(girisYap);
            }
        });


        pgiris_yap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pgirisYap = new Intent(MainActivity.this,personGiris.class);
                startActivity(pgirisYap);
            }
        });


        mgiris_yap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mgirisYap = new Intent(MainActivity.this,patronGiris.class);
                startActivity(mgirisYap);
            }
        });







    }
}