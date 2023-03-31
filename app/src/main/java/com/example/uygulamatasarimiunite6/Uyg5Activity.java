package com.example.uygulamatasarimiunite6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Uyg5Activity extends AppCompatActivity {
Button btnonayla;
EditText editTextAdSoyad,editTextTelNo,editTextEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg5);
        btnonayla = findViewById(R.id.btnOnayla);
        editTextAdSoyad = findViewById(R.id.editTextAdSoyad);
        editTextEmail = findViewById(R.id.editTextTextEmail);
        editTextTelNo = findViewById(R.id.editTextTelNo);

        btnonayla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String adiSoyadi = editTextAdSoyad.getText().toString();
                String eMail = editTextEmail.getText().toString();
                String telefonNo = editTextTelNo.getText().toString();
                Bilgi bilgilerSerializable = new Bilgi(adiSoyadi,eMail,telefonNo);
                Intent intent = new Intent(Uyg5Activity.this,Uygulama5_sayfa2_Activity.class);
                intent.putExtra("bilgiler",bilgilerSerializable);
                startActivity(intent);
            }
        });
    }
}