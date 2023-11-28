package com.example.projeto_tcc_dam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AtracoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atracoes);
    }

    public void botaoVoltar(View view){
        Intent intent  = new Intent(this, TelaInicialActivity.class);
        startActivity(intent);
    }

    public void onDescriptionButtonClick(View view) {
        String tag = (String) view.getTag();
        int imageResourceId = 0;
        String attractionName = "";

        switch (tag) {
            case "atracao_1":
                imageResourceId = R.drawable.ibira;
                attractionName = "Parque Ibirapuera";
                break;
            case "atracao_2":
                imageResourceId = R.drawable.avenida_paulista_conhe_a_o_melhor_da_cidade_de_s_o_paulo;
                attractionName = "Avenida Paulista";
                break;
            case "atracao_3":
                imageResourceId = R.drawable.pinacoteca;
                attractionName = "Pinacoteca";
                break;
            case "atracao_4":
                imageResourceId = R.drawable.mercadaosp;
                attractionName = "Mercado Municipal de SP";
                break;
        }

        Intent intent = new Intent(this, DescricaoActivity.class);

        intent.putExtra("IMAGE_RESOURCE_ID", imageResourceId);
        intent.putExtra("ATTRACTION_NAME", attractionName);

        startActivity(intent);
    }

    public void logout(View view){
        Intent intent  = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}