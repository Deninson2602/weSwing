package com.example.weswiing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inici extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inici); // Establece el layout para esta actividad

        // Establece los listeners para los botones en la actividad de Inici

        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de newsfeed
                Intent intent = new Intent(Inici.this, newsfeed.class);
                startActivity(intent); // Inicia la actividad de newsfeed
            }
        });

        findViewById(R.id.btnRegistre).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de registre
                Intent intent = new Intent(Inici.this, registre.class);
                startActivity(intent); // Inicia la actividad de registre
            }
        });
    }
}
