package com.example.projeto_tcc_dam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaInicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
    }

    public void atracoes(View view){
        Intent intent  = new Intent(this, AtracoesActivity.class);
        startActivity(intent);
    }

    public void sobreNos(View view){
        Intent intent  = new Intent(this, SobreActivity.class);
        startActivity(intent);
    }

    public void logout(View view){
        Intent intent  = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}