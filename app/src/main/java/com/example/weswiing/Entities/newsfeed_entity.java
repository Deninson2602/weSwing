package com.example.weswiing.Entities;

public class newsfeed_entity {
    private String nomApellidos; // Nombre y apellidos de la entidad relacionada

    private String title; // Título del elemento del feed de noticias

    private int numeroAsistencies; // Número de asistencias relacionadas

    private String data; // Fecha o información relacionada

    // Constructor que inicializa todos los atributos
    public newsfeed_entity(String nomApellidos, String title, int numeroAsistencies, String data) {
        this.nomApellidos = nomApellidos;
        this.title = title;
        this.numeroAsistencies = numeroAsistencies;
        this.data = data;
    }

    // Constructor que inicializa nomApellidos y data
    public newsfeed_entity(String nomApellidos , String data) {
        this.nomApellidos = nomApellidos;
        this.data = data;
    }

    // Constructor que inicializa solo nomApellidos
    public newsfeed_entity(String nomApellidos) {
        this.nomApellidos = nomApellidos;
        this.data = data; // Error: data no está definido en este constructor
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNomApellidos() {
        return nomApellidos;
    }

    public void setNomApellidos(String nomApellidos) {
        this.nomApellidos = nomApellidos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumeroAsistencies() {
        return numeroAsistencies;
    }

    public void setNumeroAsistencies(int numeroAsistencies) {
        this.numeroAsistencies = numeroAsistencies;
    }
}
