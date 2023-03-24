package com.example.uygulamatasarimiunite6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg2);
        System.out.println("onCreate Çalıştı");
    }

      @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart Çalıştı");
      }

       @Override
    protected void onResume (){
        super.onResume();
        System.out.println("onResume çalıştı");
       }
       @Override
    protected void onPause() {
        super.onPause();
        System.out.println(" onPause Çalıştı!");
    }
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop Çalıştı!");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy Çalıştı!");
    }
}