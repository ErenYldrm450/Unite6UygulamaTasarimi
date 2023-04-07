package com.example.uygulamatasarimiunite6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class Uyg8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg8);
    }
    public void fragment1(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        BirinciFragment birinciFragment =new BirinciFragment();
        fragmentTransaction.replace(R.id.frame1,birinciFragment);
        fragmentTransaction.commit();
    }
    public  void fragment2Gecis (View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        IkinciFragment i̇kinciFragment = new IkinciFragment();
        fragmentTransaction.replace(R.id.frame1,i̇kinciFragment);
        fragmentTransaction.commit();
    }
}