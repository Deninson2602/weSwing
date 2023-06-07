package com.example.weswiing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class registre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registre); // Establece el layout para esta actividad

        // Configura los spinners en la actividad de registre

        Spinner spinnerLanguages = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.genders, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerLanguages.setAdapter(adapter);

        spinnerLanguages = findViewById(R.id.spinner_languages);

        adapter = ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerLanguages.setAdapter(adapter);

        spinnerLanguages = findViewById(R.id.spinner_country);

        adapter = ArrayAdapter.createFromResource(this, R.array.countries, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerLanguages.setAdapter(adapter);

        spinnerLanguages = findViewById(R.id.spinner_cities);

        adapter = ArrayAdapter.createFromResource(this, R.array.spain_cities, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerLanguages.setAdapter(adapter);

        spinnerLanguages = findViewById(R.id.spinner_type);

        adapter = ArrayAdapter.createFromResource(this, R.array.type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerLanguages.setAdapter(adapter);

        // Establece los listeners para los botones en la actividad de registre

        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de Inici
                Intent intent = new Intent(registre.this, Inici.class);
                startActivity(intent); // Inicia la actividad de Inici
            }
        });

        findViewById(R.id.btnRetroceder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de Inici
                Intent intent = new Intent(registre.this, Inici.class);
                startActivity(intent); // Inicia la actividad de Inici
            }
        });
    }
}
