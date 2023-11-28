package com.example.projeto_tcc_dam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DescricaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao);

        int imageResourceId = getIntent().getIntExtra("IMAGE_RESOURCE_ID", 0);
        String attractionName = getIntent().getStringExtra("ATTRACTION_NAME");

        ImageView imageView = findViewById(R.id.imageAtracaoDescricao);
        imageView.setImageResource(imageResourceId);

        TextView textViewAttractionName = findViewById(R.id.textNomeAtracao);
        textViewAttractionName.setText(attractionName);
    }

    public void voltarAtracoes(View view){
        Intent intent  = new Intent(this, AtracoesActivity.class);
        startActivity(intent);
    }

    public void logout(View view){
        Intent intent  = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void procurarLocal(View view){
        Uri local = Uri.parse("geo:0,0?q="+getIntent().getStringExtra("ATTRACTION_NAME"));
        Intent intentLocal = new Intent(Intent.ACTION_VIEW, local);
        String titulo = getResources().getString(R.string.abrirNavegador);
        Intent intentChooser = Intent.createChooser(intentLocal, titulo);
        try{
            startActivity(intentChooser);
        }
        catch (ActivityNotFoundException e){
            String erro = getResources().getString(R.string.erroIntent);
            Toast toast = Toast.makeText(this, erro, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}