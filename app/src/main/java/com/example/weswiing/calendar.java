package com.example.weswiing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.weswiing.Entities.calendar_entity;
import com.example.weswiing.RecyclersActivities.calendar_recycler;

import java.util.ArrayList;
import java.util.List;

public class calendar extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private List<calendar_entity> assistents = new ArrayList<>(); // Lista para almacenar los elementos del calendario

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar); // Establece el layout para esta actividad

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(v -> updateButtonColors(button1)); // Establece el listener para el botón 1
        button2.setOnClickListener(v -> updateButtonColors(button2)); // Establece el listener para el botón 2
        button3.setOnClickListener(v -> updateButtonColors(button3)); // Establece el listener para el botón 3

        RecyclerView recycler = findViewById(R.id.assistents_recycler); // Obtiene una referencia al RecyclerView desde el layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this); // Crea un LinearLayoutManager para el RecyclerView

        calendar_recycler adapter = new calendar_recycler(assistents); // Crea un adaptador para el RecyclerView con la lista de elementos del calendario

        recycler.setLayoutManager(linearLayoutManager); // Establece el LinearLayoutManager en el RecyclerView
        recycler.setAdapter(adapter); // Establece el adaptador en el RecyclerView

        int[] nums = {2, 2};

        // Agrega algunos elementos a la lista de elementos del calendario
        adapter.add(new calendar_entity("I'm beginning to see the light", "18 de abril de 2017 ", "Big Mama", "17/07/2017 - 18/04/2017 | 2h hores", "Madrid, spain", nums));
        adapter.add(new calendar_entity("I'm beginning to see the light", "18 de abril de 2017 ", "Big Mama", "17/07/2017 - 18/04/2017 | 2h hores", "Madrid, spain", nums));
        adapter.add(new calendar_entity("I'm beginning to see the light", "18 de abril de 2017 ", "Big Mama", "17/07/2017 - 18/04/2017 | 2h hores", "Madrid, spain", nums));

        adapter.setOnItemClick(new calendar_recycler.OnItemClick() {
            @Override
            public void getPosition(int pos) {
                // Aquí se puede agregar el código para manejar el evento de clic en un elemento del calendario
            }
        });

        findViewById(R.id.filtrar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de filtres
                Intent intent = new Intent(calendar.this, filtres.class);
                startActivity(intent); // Inicia la actividad de filtres
            }
        });

        findViewById(R.id.btnHour).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de newsfeed
                Intent intent = new Intent(calendar.this, newsfeed.class);
                startActivity(intent); // Inicia la actividad de newsfeed
            }
        });
    }

    private void updateButtonColors(Button clickedButton) {
        // Restablece el color de fondo de todos los botones
        button1.setBackgroundColor(Color.parseColor("#e7e2d6"));
        button2.setBackgroundColor(Color.parseColor("#e7e2d6"));
        button3.setBackgroundColor(Color.parseColor("#e7e2d6"));

        // Establece el color de fondo del botón seleccionado
        clickedButton.setBackgroundColor(Color.parseColor("#a24844"));
    }
}
