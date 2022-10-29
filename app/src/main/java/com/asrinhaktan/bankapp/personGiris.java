package com.asrinhaktan.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class personGiris extends AppCompatActivity {
    public Button geri_1;
    public Button maas_gor;
    public Button email_gor;
    public Button tel_gor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_giris);

        geri_1 = (Button)findViewById(R.id.geri1);
        maas_gor =(Button)findViewById(R.id.maasgor);
        email_gor =(Button)findViewById(R.id.emailgor);
        tel_gor =(Button)findViewById(R.id.telgor);


        geri_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geri1=new Intent(personGiris.this,MainActivity.class);
                startActivity(geri1);
            }
        });





    }
}