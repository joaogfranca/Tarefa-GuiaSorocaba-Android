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

public class TelaChicoMendes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_chico_mendes);
    }

    public void btnFecharChicoMendes(View view) {
        finish();
    }

    public void btnMapaChicoMendes(View view) {
        Uri uri = Uri.parse("geo:0,0?q=Avenida+Três+de+Março+1025");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnTelefoneChicoMendes(View view) {
        Uri uri = Uri.parse("tel:1532281256");
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

    public void btnAbrirSiteChicoMendes(View view) {
        Uri webpage = Uri.parse("https://meioambiente.sorocaba.sp.gov" +
                ".br/gestaoambiental/parque-natural-chico-mendes/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}