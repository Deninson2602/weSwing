package com.example.weswiing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil); // Establece el layout para esta actividad

        // Establece los listeners para los botones en la actividad de perfil

        findViewById(R.id.btnCalendar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de calendar
                Intent intent = new Intent(perfil.this, calendar.class);
                startActivity(intent); // Inicia la actividad de calendar
            }
        });

        findViewById(R.id.profileEscola).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de escola
                Intent intent = new Intent(perfil.this, escola.class);
                startActivity(intent); // Inicia la actividad de escola
            }
        });

        findViewById(R.id.btnRetroceder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de assistents
                Intent intent = new Intent(perfil.this, assistents.class);
                startActivity(intent); // Inicia la actividad de assistents
            }
        });
    }
}
