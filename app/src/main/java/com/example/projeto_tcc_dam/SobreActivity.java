package com.example.projeto_tcc_dam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
    }

    public void voltarInicial(View view){
        Intent intent  = new Intent(this, TelaInicialActivity.class);
        startActivity(intent);
    }

    public void logout(View view){
        Intent intent  = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}