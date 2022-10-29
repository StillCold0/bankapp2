package com.asrinhaktan.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kullGiris extends AppCompatActivity {
    public Button Varlik_gor;
    public Button isim_gor;
    public Button borc_gor;
    public Button odeme_yap;
    public Button geri_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_sonrasi);

        Varlik_gor =(Button)findViewById(R.id.varlikgor);
        isim_gor =(Button)findViewById(R.id.adsoyadgor);
        borc_gor =(Button)findViewById(R.id.borcgor);
        odeme_yap =(Button)findViewById(R.id.odemeYap);
        geri_3 =(Button)findViewById(R.id.geri3);


        geri_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geri3 = new Intent(kullGiris.this,MainActivity.class);
                startActivity(geri3);
            }
        });

        odeme_yap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent odemeYap = new Intent(kullGiris.this,odemesekme.class);
                startActivity(odemeYap);
            }
        });







    }
}