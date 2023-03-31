package com.example.uygulamatasarimiunite6;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uygulama5_sayfa2_Activity extends AppCompatActivity {
    TextView textbir,textiki,textUC;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity5_2);
        textbir = findViewById(R.id.textbir);
        textiki = findViewById(R.id.textiki);
        textUC = findViewById(R.id.textUC);

        Bilgi bilgiler = (Bilgi) getIntent().getSerializableExtra("bilgiler");
        textbir.setText(bilgiler.getAdiSoyadi());
        textiki.setText(bilgiler.geteMail());
        textUC.setText(bilgiler.getTelefonNo());
    }
}
