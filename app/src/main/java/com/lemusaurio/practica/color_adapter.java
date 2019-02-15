package com.lemusaurio.practica;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class color_adapter extends RecyclerView.Adapter<color_adapter.MyViewHolder> {
    private List<Color> colorList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, genre, color;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            color = (TextView) view.findViewById(R.id.box);

        }
    }


    public color_adapter(List<Color> moviesList) {
        this.colorList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.color_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Color color = colorList.get(position);
        holder.title.setText(color.getNombre());
        holder.genre.setText(color.getCodigo());
        holder.color.setBackgroundColor(android.graphics.Color.parseColor(color.getCodigo()));
    }

    @Override
    public int getItemCount() {
        return colorList.size();
    }
}
