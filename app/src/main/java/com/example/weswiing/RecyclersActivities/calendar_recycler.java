package com.example.weswiing.RecyclersActivities;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weswiing.Entities.calendar_entity;
import com.example.weswiing.R;
import com.example.weswiing.Views.calendar_view;

import java.util.ArrayList;
import java.util.List;


public class calendar_recycler extends RecyclerView.Adapter<calendar_view> {

    private List<calendar_entity> calendarEntities;

    public calendar_recycler(List<calendar_entity> newsfeed) {
        this.calendarEntities = newsfeed;
    }

    public List<calendar_entity> get() {
        return calendarEntities;
    }

    public void add(calendar_entity newsFeed) {
        this.calendarEntities.add(newsFeed);
        this.notifyItemInserted(this.calendarEntities.size() - 1);
    }

    public void flush(){
        this.calendarEntities = new ArrayList<>();
    }

    @NonNull
    @Override
    public calendar_view onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflar el diseño de la vista del elemento del calendario
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.calendar_form, parent, false);
        final calendar_view viewHolder = new calendar_view(vista);

        vista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para manejar el clic en el elemento del calendario
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull calendar_view holder, @SuppressLint("RecyclerView") int position) {
        // Obtener la entidad del calendario en la posición actual
        calendar_entity calendar = this.calendarEntities.get(position);

        // Establecer los datos de la entidad en los componentes de la vista del elemento del calendario
        holder.getData_header().setText(calendar.getData_header());
        holder.getOrganitzar().setText("Organitzar per " + calendar.getOrganitzar());
        holder.getFecha().setText(calendar.getFecha());
        holder.getLocation().setText(calendar.getLocation());
        holder.getAssistents_amics().setText(calendar.getAssistents_amics()[0] + " asssistents | " + calendar.getAssistents_amics()[0] +  " amics");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Invocar el método de la interfaz onItemClick cuando se hace clic en el elemento del calendario
                onItemClick.getPosition(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.calendarEntities.size();
    }

    // Interfaz para manejar el evento de clic en un elemento del calendario
    OnItemClick onItemClick;

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public interface OnItemClick {
        void getPosition(int pos);
    }
}
