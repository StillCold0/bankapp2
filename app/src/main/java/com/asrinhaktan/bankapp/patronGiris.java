package com.asrinhaktan.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class patronGiris extends AppCompatActivity {
    public Button geri_2;
    public Button maas_gor;
    public Button email_gor;
    public Button tel_gor;
    public Button p_gor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patron_giris);


        geri_2 = (Button)findViewById(R.id.geri2);
        maas_gor =(Button)findViewById(R.id.maasgor);
        email_gor =(Button)findViewById(R.id.emailgor);
        tel_gor =(Button)findViewById(R.id.telgor);
        p_gor =(Button)findViewById(R.id.pgor);

        p_gor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pgor = new Intent(patronGiris.this,personGiris.class);
                startActivity(pgor);
            }
        });

        geri_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geri2 = new Intent(patronGiris.this,MainActivity.class);
                startActivity(geri2);
            }
        });


    }
}