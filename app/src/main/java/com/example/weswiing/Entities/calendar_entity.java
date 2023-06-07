package com.example.weswiing.Entities;

public class calendar_entity {

    private String data_header; // Cabecera de la fecha
    private String organitzar; // Organizador del evento
    private String fecha; // Fecha del evento
    private String location; // Ubicación del evento
    private String context; // Contexto o descripción del evento
    private int[] assistents_amics; // Array de asistentes y amigos

    public calendar_entity(String context, String data_header, String organitzar, String fecha, String location, int[] assistents_amics) {
        this.context = context;
        this.data_header = data_header;
        this.organitzar = organitzar;
        this.fecha = fecha;
        this.location = location;
        this.assistents_amics = assistents_amics;
    }

    public String getData_header() {
        return data_header;
    }

    public void setData_header(String data_header) {
        this.data_header = data_header;
    }

    public String getOrganitzar() {
        return organitzar;
    }

    public void setOrganitzar(String organitzar) {
        this.organitzar = organitzar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int[] getAssistents_amics() {
        return assistents_amics;
    }

    public void setAssistents_amics(int[] assistents_amics) {
        this.assistents_amics = assistents_amics;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
