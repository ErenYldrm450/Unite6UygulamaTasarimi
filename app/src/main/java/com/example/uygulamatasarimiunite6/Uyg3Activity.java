package com.example.uygulamatasarimiunite6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Uyg3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg3);
        EditText ad = findViewById(R.id.editTextAdSoyad);
        EditText TelNo = findViewById(R.id.editTextTelNo);
        Button activity = findViewById(R.id.btnactivity);



        activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ad2 = ad.getText().toString();
                String TelNo2 = TelNo.getText().toString();
                Intent intent = new Intent(Uyg3Activity.this,
                        Uyg3bilgi.class);
                intent.putExtra("adiSoyadiKey",ad2);
                intent.putExtra("telefonNoKey",TelNo2);
                startActivity(intent);
            }

        });
    }
}