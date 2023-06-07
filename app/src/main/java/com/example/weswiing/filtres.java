package com.example.weswiing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class filtres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtres); // Establece el layout para esta actividad

        // Configuración del Spinner para seleccionar el país

        Spinner spinnerLanguages = findViewById(R.id.spinner_pais); // Obtiene una referencia al Spinner desde el layout

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.countries, android.R.layout.simple_spinner_item); // Crea un ArrayAdapter con los elementos del recurso de array "countries"
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_item); // Establece el layout del drop-down para el ArrayAdapter
        spinnerLanguages.setAdapter(adapter1); // Establece el ArrayAdapter en el Spinner

        // Configuración del Spinner para seleccionar la ciudad

        spinnerLanguages = findViewById(R.id.spinner_ciudad); // Obtiene una referencia al Spinner desde el layout

        adapter1 = ArrayAdapter.createFromResource(this, R.array.spain_cities, android.R.layout.simple_spinner_item); // Crea un ArrayAdapter con los elementos del recurso de array "spain_cities"
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_item); // Establece el layout del drop-down para el ArrayAdapter
        spinnerLanguages.setAdapter(adapter1); // Establece el ArrayAdapter en el Spinner

        // Establece los listeners para los botones en la actividad de filtres

        findViewById(R.id.save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de calendar
                Intent intent = new Intent(filtres.this, calendar.class);
                startActivity(intent); // Inicia la actividad de calendar
            }
        });

        findViewById(R.id.btnRetroceder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de calendar
                Intent intent = new Intent(filtres.this, calendar.class);
                startActivity(intent); // Inicia la actividad de calendar
            }
        });
    }
}
