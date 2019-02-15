package com.lemusaurio.practica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Color> colorList = new ArrayList<>();
    private RecyclerView recyclerView;
    private color_adapter cAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        cAdapter = new color_adapter(colorList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(cAdapter);

        prepareColorData();
    }
    private void prepareColorData() {
        Color color = new Color("Rojo", "#f20c0c");
        colorList.add(color);
        color = new Color("Verde", "#4da575");
        colorList.add(color);
        color = new Color("Verde claro", "#27ea7f");
        colorList.add(color);
        color = new Color("Amarillo", "#e7ea27");
        colorList.add(color);
        color = new Color("Naranja", "#E46038");
        colorList.add(color);
        color = new Color("Rosa", "#E68CC3");
        colorList.add(color);
        color = new Color("Morado", "#8245E2");
        colorList.add(color);
        color = new Color("Negro", "#000000");
        colorList.add(color);
        color = new Color("Azul Marino", "#0B1E7D");
        colorList.add(color);
        color = new Color("Azul cielo", "#8AC6F1");
        colorList.add(color);
        color = new Color("cafe", "#7C431C");
        colorList.add(color);
        color = new Color("Blanco", "#ffffff");
        colorList.add(color);
        color = new Color("Gris", "#606368");
        colorList.add(color);
        color = new Color("Beige", "#E3CABE");
        colorList.add(color);








    }
}
