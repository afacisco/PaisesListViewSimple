package com.example.paiseslistviewsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

/*
Autor: Juan Francisco Sánchez González
Fecha: 02/11/2022
Clase: Actividad diseñada con LinearLayouts, se utiliza un ListView y un TextView. Se rellena el listado
con el nombre de 10 países sacados de un recurso (valoresPaises.xml). Cuando se ejecute el TextView debe
tomar el nombre del elemento tocado del ListView.
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        TextView mensaje = (TextView) findViewById(R.id.tvMensaje);
        ListView listado = (ListView) findViewById(R.id.lvPaises);
        // Listener del pulsado de un elemento del listado
        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pais = (String) adapterView.getItemAtPosition(i);
                mensaje.setText(getText(R.string.mensajeTexto) + pais);
            }
        });
    }
}