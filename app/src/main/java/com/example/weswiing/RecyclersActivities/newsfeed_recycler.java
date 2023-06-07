package com.example.weswiing.RecyclersActivities;

import android.annotation.SuppressLint;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weswiing.Entities.newsfeed_entity;
import com.example.weswiing.R;
import com.example.weswiing.Views.newsfeed_view;

import java.util.ArrayList;
import java.util.List;

public class newsfeed_recycler extends RecyclerView.Adapter<newsfeed_view> {

    private List<newsfeed_entity> newsFeedEntities;

    public newsfeed_recycler(List<newsfeed_entity> newsfeed) {
        this.newsFeedEntities = newsfeed;
    }

    public List<newsfeed_entity> get() {
        return newsFeedEntities;
    }

    public void add(newsfeed_entity newsFeed) {
        this.newsFeedEntities.add(newsFeed);
        this.notifyItemInserted(this.newsFeedEntities.size() - 1);
    }

    public void flush(){
        this.newsFeedEntities = new ArrayList<>();
    }

    @NonNull
    @Override
    public newsfeed_view onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflar el diseño de la vista del elemento del newsfeed
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.newsfeed_form, parent, false);
        final newsfeed_view viewHolder = new newsfeed_view(vista);

        vista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para manejar el clic en el elemento del newsfeed
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull newsfeed_view holder, @SuppressLint("RecyclerView") int position) {
        // Obtener el objeto newsfeed_entity en la posición actual
        newsfeed_entity news = this.newsFeedEntities.get(position);

        // Crear el texto para mostrar en el contexto del newsfeed con formato HTML
        String context = news.getNomApellidos() + " <font color='#666666'>asistira a </font>" + news.getTitle() + "<font color='#666666'> ( " + String.valueOf(news.getNumeroAsistencies()) + " assistents) </font>";
        // Establecer el texto formateado en el componente de contexto del newsfeed
        holder.getContext().setText(Html.fromHtml(context));
        holder.getHorari().setText("Fa " + news.getData());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Invocar el método de la interfaz onItemClick cuando se hace clic en el elemento del newsfeed
                onItemClick.getPosition(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.newsFeedEntities.size();
    }

    // Interfaz para manejar el evento de clic en un elemento del newsfeed
    OnItemClick onItemClick;

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public interface OnItemClick {
        void getPosition(int pos);
    }
}
