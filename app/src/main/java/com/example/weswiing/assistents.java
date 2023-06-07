package com.example.weswiing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.weswiing.RecyclersActivities.assistents_recycler;
import com.example.weswiing.Entities.newsfeed_entity;

import java.util.ArrayList;
import java.util.List;

public class assistents extends AppCompatActivity {

    private List<newsfeed_entity> assistents = new ArrayList<>(); // Lista para almacenar los asistentes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistents); // Establece el layout para esta actividad

        RecyclerView recycler = findViewById(R.id.assistents_recycler); // Obtiene una referencia al RecyclerView desde el layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this); // Crea un LinearLayoutManager para el RecyclerView

        assistents_recycler adapter = new assistents_recycler(assistents); // Crea un adaptador para el RecyclerView con la lista de asistentes

        recycler.setLayoutManager(linearLayoutManager); // Establece el LinearLayoutManager en el RecyclerView
        recycler.setAdapter(adapter); // Establece el adaptador en el RecyclerView

        // Agrega algunos elementos a la lista de asistentes
        assistents.add(new newsfeed_entity("Alba Cas Lemoonhop", "Dancer"));
        assistents.add(new newsfeed_entity("Angela Manela Also", "Dancer"));
        assistents.add(new newsfeed_entity("Jana Gruilichova", "Professor"));
        assistents.add(new newsfeed_entity("Jazzmin Olave", "Dancer"));
        assistents.add(new newsfeed_entity("Neus Castells Maré", "Professor"));

        // Establece el listener para el evento de clic en el adaptador
        adapter.setOnItemClick(new assistents_recycler.OnItemClick() {
            @Override
            public void getPosition(int pos) {
                // Crea un Intent para abrir la actividad de perfil
                Intent intent = new Intent(assistents.this, perfil.class);
                startActivity(intent); // Inicia la actividad de perfil
            }
        });

        ImageView imageView1 = findViewById(R.id.btnHour);
        findViewById(R.id.btnHour).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de newsfeed
                Intent intent = new Intent(assistents.this, newsfeed.class);
                startActivity(intent); // Inicia la actividad de newsfeed
            }
        });

        findViewById(R.id.btnRetroceder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de escola
                Intent intent = new Intent(assistents.this, escola.class);
                startActivity(intent); // Inicia la actividad de escola
            }
        });

        findViewById(R.id.assistents_recycler).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la actividad de perfil
                Intent intent = new Intent(assistents.this, perfil.class);
                startActivity(intent); // Inicia la actividad de perfil
            }
        });
    }
}
