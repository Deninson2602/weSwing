package com.example.weswiing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class escola extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escola); // Establece el layout para esta actividad

        // Establece los listeners para los botones en la actividad de escola

        findViewById(R.id.professors).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de profes
                Intent intent = new Intent(escola.this, profes.class);
                startActivity(intent); // Inicia la actividad de profes
            }
        });

        findViewById(R.id.btnCalendar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de calendar
                Intent intent = new Intent(escola.this, calendar.class);
                startActivity(intent); // Inicia la actividad de calendar
            }
        });

        findViewById(R.id.btnProfes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de profes
                Intent intent = new Intent(escola.this, profes.class);
                startActivity(intent); // Inicia la actividad de profes
            }
        });

        findViewById(R.id.btnAssistents).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de assistents
                Intent intent = new Intent(escola.this, assistents.class);
                startActivity(intent); // Inicia la actividad de assistents
            }
        });
    }
}
