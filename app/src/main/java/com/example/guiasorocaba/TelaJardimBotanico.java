package com.example.guiasorocaba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class TelaJardimBotanico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jardim_botanico);
    }

    public void btnFecharJardimBotanico(View view) {
        finish();
    }

    public void btnMapaJdBotanico(View view) {
        Uri uri = Uri.parse("geo:0,0?q=Rua+Miguel+Montoro+Lozano+340");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnTelefoneJdBotanico(View view) {
        Uri uri = Uri.parse("tel:1532351130");
        Intent intent = new Intent(Intent.ACTION_CALL, uri);
        int permissionCheck =
                ContextCompat.checkSelfPermission(this,
                        android.Manifest.permission.CALL_PHONE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{
                            Manifest.permission.CALL_PHONE}, 1);
        } else {
            startActivity(intent);
        }
    }

    public void btnAbrirSiteJdBotanico(View view) {
        Uri webpage = Uri.parse("https://turismo.sorocaba.sp.gov" +
                ".br/visite/jardim-botanico-irmaos-vilas-boas/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}