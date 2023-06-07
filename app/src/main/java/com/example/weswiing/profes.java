package com.example.weswiing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.weswiing.RecyclersActivities.assistents_recycler;
import com.example.weswiing.Entities.newsfeed_entity;

import java.util.ArrayList;
import java.util.List;

public class profes extends AppCompatActivity {

    private List<newsfeed_entity> assistents = new ArrayList<>(); // Lista para almacenar los asistentes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profes); // Establece el layout para esta actividad

        RecyclerView recycler = findViewById(R.id.assistents_recycler); // Obtiene una referencia al RecyclerView desde el layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this); // Crea un LinearLayoutManager para el RecyclerView

        assistents_recycler adapter = new assistents_recycler(assistents); // Crea un adaptador para el RecyclerView con la lista de asistentes

        recycler.setLayoutManager(linearLayoutManager); // Establece el LinearLayoutManager en el RecyclerView
        recycler.setAdapter(adapter); // Establece el adaptador en el RecyclerView

        // Agrega algunos asistentes a la lista de asistentes
        assistents.add(new newsfeed_entity("Martynas Balčiūnas"));
        assistents.add(new newsfeed_entity("Marina Feliu"));
        assistents.add(new newsfeed_entity("Jordi Mundet"));
        assistents.add(new newsfeed_entity("Lorena Medina Pulido"));
        assistents.add(new newsfeed_entity("Jaume De Francisco Guiu"));
        assistents.add(new newsfeed_entity("Jana Gruilichova"));
        assistents.add(new newsfeed_entity("Joan-Marc Comalada"));

        adapter.setOnItemClick(new assistents_recycler.OnItemClick() {
            @Override
            public void getPosition(int pos) {
                // Crea un Intent para abrir la actividad de perfil
                Intent intent = new Intent(profes.this, perfil.class);
                startActivity(intent); // Inicia la actividad de perfil
            }
        });

        findViewById(R.id.btnCalendar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de calendar
                Intent intent = new Intent(profes.this, calendar.class);
                startActivity(intent); // Inicia la actividad de calendar
            }
        });

        findViewById(R.id.btnRetroceder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de escola
                Intent intent = new Intent(profes.this, escola.class);
                startActivity(intent); // Inicia la actividad de escola
            }
        });
    }
}
