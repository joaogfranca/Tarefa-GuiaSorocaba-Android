package com.example.guiasorocaba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaDeAbertura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_abertura);
    }

    public void btnFechar(View view) {
        finish();
    }

    public void btnTelaChico(View view) {
        Intent intent = new Intent(this, TelaChicoMendes.class);
        startActivity(intent);
    }

    public void btnTelaBotanico(View view) {
        Intent intent = new Intent(this, TelaJardimBotanico.class);
        startActivity(intent);
    }

    public void btnTelaZoo(View view) {
        Intent intent = new Intent(this, TelaZoo.class);
        startActivity(intent);
    }
}