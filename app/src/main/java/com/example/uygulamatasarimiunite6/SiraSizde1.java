package com.example.uygulamatasarimiunite6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SiraSizde1 extends AppCompatActivity {
    TextView dogumt, isim, hakkinda;
    Button ileri,geri;
    ImageView imgresim;
    int sayac = -1;
    public void tanimlamalar() {
        dogumt = findViewById(R.id.ss247YasamT);
        isim = findViewById(R.id.ss247AdSoyad);
        hakkinda = findViewById(R.id.ss247Hakkinda);
        imgresim = findViewById(R.id.ss247Resim);
        ileri = findViewById(R.id.ss247Ileri);
        geri = findViewById(R.id.ss247Geri);
    }

    ArrayList<SiraSizde1_Class> sinif = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sira_sizde1);
        tanimlamalar();

        SiraSizde1_Class kisi1 = new SiraSizde1_Class("8 Eylül 1946","Aziz Sancar","Türk Kimyager ve bilim insanı.",1,R.drawable.azizsancar);
        SiraSizde1_Class kisi2 = new SiraSizde1_Class("(Unknown) 1403","Ali Kuşçu","Müslüman Fizikçi ve filozof.",2,R.drawable.alikuscu);
        SiraSizde1_Class kisi3 = new SiraSizde1_Class("(Unknown) 780","Harezmi","Matematikçi ve gök bilimcidir.",3,R.drawable.harezmi);
        SiraSizde1_Class kisi4 = new SiraSizde1_Class("12 Ağustos 980","İbn Sînâ","Doktor astronom ve yazardır.",4,R.drawable.ibnsina);
        SiraSizde1_Class kisi5 = new SiraSizde1_Class("10 Temmuz 1856","Nikola Tesla","Elektrik Mühendisi ve Mucit.",5,R.drawable.tesla);
        SiraSizde1_Class kisi6 = new SiraSizde1_Class("24 Mart 1955","Celal Şengör","Başarılı Türk yer bilimci.",6,R.drawable.jamalsengor);
        SiraSizde1_Class kisi7 = new SiraSizde1_Class("21 Mayıs 1947","İlber Ortaylı","Başarılı Türk Tarihçi ve yazar.",7,R.drawable.ilberhocam);
        SiraSizde1_Class kisi8 = new SiraSizde1_Class("(Unknown) 1465","Piri Reis","Türk Denizci ve Kartograf.",8,R.drawable.pirireis);
        SiraSizde1_Class kisi9 = new SiraSizde1_Class("(Unknown) 1008","Kaşgarlı Mahmut","Türk dilci ve leksikograf.",9,R.drawable.kasgarlimahmut);
        SiraSizde1_Class kisi10 = new SiraSizde1_Class("14 Mart 1879","Albert Einstein","Teorik fizikçi ve bilim adamı.",10,R.drawable.einstein);

        sinif.add(kisi1);
        sinif.add(kisi2);
        sinif.add(kisi3);
        sinif.add(kisi4);
        sinif.add(kisi5);
        sinif.add(kisi6);
        sinif.add(kisi7);
        sinif.add(kisi8);
        sinif.add(kisi9);
        sinif.add(kisi10);

        ileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sayac < 9 && sayac >= -1) {
                    sayac++;
                    imgresim.setImageResource(sinif.get(sayac).resim);
                    dogumt.setText("Yaşam Tarihi: " + sinif.get(sayac).dogumtarihi);
                    isim.setText("İsim Soyisim: " + sinif.get(sayac).isimsoyisim);
                    hakkinda.setText("Hakkında: " + sinif.get(sayac).hakkinda);
                }
                else {
                    Toast.makeText(SiraSizde1.this, "Sona geldin.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sayac <= 10 && sayac > 0) {
                    sayac--;
                    imgresim.setImageResource(sinif.get(sayac).resim);
                    dogumt.setText("Yaşam Tarihi: " + sinif.get(sayac).dogumtarihi);
                    isim.setText("İsim Soyisim: " + sinif.get(sayac).isimsoyisim);
                    hakkinda.setText("Hakkında: " + sinif.get(sayac).hakkinda);
                }
                else {
                    Toast.makeText(SiraSizde1.this, "Sona geldin.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}