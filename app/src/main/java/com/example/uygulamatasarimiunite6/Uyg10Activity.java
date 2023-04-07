package com.example.uygulamatasarimiunite6;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Toast;

public class Uyg10Activity extends AppCompatActivity {
 ActivityResultLauncher<Intent> galeryResultLauncher;
 ActivityResultLauncher<String> izinlerResultLauncher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg10);
        metotGaleryResultLauncher();
        metotIzinlerResultLuncher();
    }

    public void galeriyeGit(View view){
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED){
            //İzin yok ,İzin istenecektir,
        }else{
            //İzin var , galeriye gidilecektir.
            Intent galeri = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }
    }

    public void metotGaleryResultLauncher(){
        galeryResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if(result.getResultCode()==RESULT_OK){
                    Intent intentSonuc = result.getData();
                    if(intentSonuc!=null){
                        Uri fotoVeri = intentSonuc.getData();
                    }
                }
            }});
    }


    public void metotIzinlerResultLuncher(){
        izinlerResultLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback<Boolean>() {
            @Override
            public void onActivityResult(Boolean result) {
                if(result == true ){
                    //İzin var, galeriye gidilecektir.
                    Intent galeri = new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI );
                }else
                {
                    //İzin istenmesi gerekecektir.
                    Toast.makeText(Uyg10Activity.this,"İzin Vermeniz Gerekecektir",Toast.LENGTH_LONG).show();

                }
            }
        });
    }

}