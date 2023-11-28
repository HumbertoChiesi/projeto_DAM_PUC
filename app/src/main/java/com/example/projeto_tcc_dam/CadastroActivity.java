package com.example.projeto_tcc_dam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void cadastrarUsuario(View view){
        Intent intent  = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void botaoVoltarLogin(View view){
        Intent intent  = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}