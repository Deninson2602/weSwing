package com.example.weswiing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.weswiing.Entities.newsfeed_entity;
import com.example.weswiing.RecyclersActivities.newsfeed_recycler;

import java.util.ArrayList;
import java.util.List;

public class newsfeed extends AppCompatActivity {

    private List<newsfeed_entity> newsfeeds = new ArrayList<>(); // Lista para almacenar las noticias

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsfeed); // Establece el layout para esta actividad

        RecyclerView recycler = findViewById(R.id.novetats_recycler); // Obtiene una referencia al RecyclerView desde el layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this); // Crea un LinearLayoutManager para el RecyclerView

        newsfeed_recycler adapter = new newsfeed_recycler(newsfeeds); // Crea un adaptador para el RecyclerView con la lista de noticias

        recycler.setLayoutManager(linearLayoutManager); // Establece el LinearLayoutManager en el RecyclerView
        recycler.setAdapter(adapter); // Establece el adaptador en el RecyclerView

        // Agrega algunas noticias a la lista de noticias
        newsfeeds.add(new newsfeed_entity("Angela Manela", "Festa d'inici de Trimestre i presentació dels professors!", 5 , "10 hores"));
        newsfeeds.add(new newsfeed_entity("Angela Manela", "Festa d'inici de Trimestre i presentació dels professors!", 5 , "10 hores"));
        newsfeeds.add(new newsfeed_entity("Angela Manela", "Festa d'inici de Trimestre i presentació dels professors!", 5 , "10 hores"));
        // ...
        // Otras noticias

        adapter.setOnItemClick(new newsfeed_recycler.OnItemClick() {
            @Override
            public void getPosition(int pos) {
                // Crea un Intent para abrir la actividad de moguda
                Intent intent = new Intent(newsfeed.this, moguda.class);
                startActivity(intent); // Inicia la actividad de moguda
            }
        });

        findViewById(R.id.btnCalendar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de calendar
                Intent intent = new Intent(newsfeed.this, calendar.class);
                startActivity(intent); // Inicia la actividad de calendar
            }
        });

        findViewById(R.id.btnProfile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de perfil
                Intent intent = new Intent(newsfeed.this, perfil.class);
                startActivity(intent); // Inicia la actividad de perfil
            }
        });

        findViewById(R.id.btnRetroceder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de Inici
                Intent intent = new Intent(newsfeed.this, Inici.class);
                startActivity(intent); // Inicia la actividad de Inici
            }
        });
    }
}
