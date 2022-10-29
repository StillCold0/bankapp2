package com.asrinhaktan.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class odemesekme extends AppCompatActivity {
    public Button odeme_yap;
    public Button geridon_4;
    public Button borc_gor;
    public Button varlik_gor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odemesekme);


        odeme_yap =(Button)findViewById(R.id.odemeYap);
        geridon_4 =(Button)findViewById(R.id.geri4);
        borc_gor =(Button)findViewById(R.id.borcgor);
        varlik_gor =(Button)findViewById(R.id.varlikgor);


        odeme_yap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Ödeme Yapıldı bakiyeden düşüldü", Toast.LENGTH_LONG);
                toast.show();

            }
        });

        geridon_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geridon4 = new Intent(odemesekme.this,kullGiris.class);
                startActivity(geridon4);
            }
        });





    }
}