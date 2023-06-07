package com.example.weswiing.Views;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weswiing.R;

public class newsfeed_view extends RecyclerView.ViewHolder {
    private final TextView context, horari;
    private final ImageView profilepic, go;

    public newsfeed_view(@NonNull View itemView) {
        super(itemView);
        // Asignar las vistas de texto e imágenes a los componentes correspondientes en el diseño de la vista del elemento del feed de noticias
        context = itemView.findViewById(R.id.context);
        profilepic = itemView.findViewById(R.id.profile_pic);
        go = itemView.findViewById(R.id.action_go);
        horari = itemView.findViewById(R.id.horari);
    }

    public TextView getContext() {
        return context;
    }

    public ImageView getProfilepic() {
        return profilepic;
    }

    public ImageView getGo() {
        return go;
    }

    public TextView getHorari() {
        return horari;
    }
}
