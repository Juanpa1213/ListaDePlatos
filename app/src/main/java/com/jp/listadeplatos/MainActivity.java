package com.jp.listadeplatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lista;

    String[][] datos = {
            //nombre,precio,descripcion
            {"Fetucci Alfredo","60 Bs","Pasta con salsa Alfredo"},
            {"Lasaña","65 Bs","Pasta en capas intercalada con carne y salsa blanca"},
            {"Milanesa","45 Bs","Milanesa de res acompañada con papas fritas , limon y ensalada"},
            {"Paella","120 Bs", "Arroz, verduras, calamares, almejas, camarones "},
            {"Pique Macho", "60 Bs","Trozos de carne, salchichas ,papas fritas ,huevo ,locoto y tomate"}
    };
    int[] datosImagenes = {R.drawable.fetuccini_alfredo,R.drawable.lasania,R.drawable.milanesa,R.drawable.paella,R.drawable.pique};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista =  (ListView) findViewById(R.id.Lista);
        lista.setAdapter(new Adapter(this, datos,datosImagenes));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDescripcion = new Intent(view.getContext(),descripcion.class);
                visorDescripcion.putExtra("nombre",datos[(position)][0]);
                visorDescripcion.putExtra("imagen",datosImagenes[position]);
                visorDescripcion.putExtra("precio",datos[(position)][1]);
                visorDescripcion.putExtra( "descripcion",datos[(position)][2]);
                startActivity(visorDescripcion);
            }
        });
    }
}
