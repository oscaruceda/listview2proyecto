package com.example.oscaruceda.listview2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private Adaptador adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listv);
        adaptador = new Adaptador(GetArrayItems(), this);
        listView.setAdapter(adaptador);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                prueba(MainActivity.this,position);
            }
        });
    }
    private ArrayList<Entidad> GetArrayItems(){
        ArrayList<Entidad> lsData = new ArrayList<>();
        lsData.add(new Entidad(R.drawable.imgalba,"ALBA"));
        lsData.add(new Entidad(R.drawable.imganaa,"ANAA"));
        lsData.add(new Entidad(R.drawable.imglamadrilena,"LAMADRILEÑA"));
        lsData.add(new Entidad(R.drawable.imgperrikus,"PERRIKUS"));
        lsData.add(new Entidad(R.drawable.imgrivanimal,"RIVANIMAL"));
        lsData.add(new Entidad(R.drawable.imgspap,"SPAP"));
        return lsData;
    }

    public void prueba (final Context context, final int position ){

        if(position == 0){
            Intent intent = new Intent(context,protectora_view.class);
            startActivity(intent);
        }else if(position == 1){
            Intent intent = new Intent(context,protectora_view1.class);
            startActivity(intent);
        }
        else if(position == 2){
            Intent intent = new Intent(context,protectora_view2.class);
            startActivity(intent);
        }
        else if(position == 3){
            Intent intent = new Intent(context,protectora_view3.class);
            startActivity(intent);
        }
        else if(position == 4){
            Intent intent = new Intent(context,protectora_view4.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(context,protectora_view5.class);
            startActivity(intent);
        }
    }
}
