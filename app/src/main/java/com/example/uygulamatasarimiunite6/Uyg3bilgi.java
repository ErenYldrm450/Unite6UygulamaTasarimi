package com.example.uygulamatasarimiunite6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3bilgi extends AppCompatActivity {
    private Uyg3bilgi binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg11);
        Intent intent = getIntent();
        String bilgiAdiSoyadi = intent.getStringExtra("adiSoyadiKey");
        String bilgiTelefonNo = intent.getStringExtra("telefonNoKey");
        TextView a = findViewById(R.id.textView);
        TextView b = findViewById(R.id.textView2);
        a.setText(bilgiAdiSoyadi);
        b.setText(bilgiTelefonNo);
    }
}
