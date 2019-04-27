package com.jp.listadeplatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lista;

    String[][] datos = {
            //nombre,precio,descripcion
            {"Fetucci Alfredo","60 Bs","Pasta con salsa Alfredo"},
            {"Lasania","65 Bs","Pasta en capas intercalada con carne y salsa blanca"},
            {"Milanesa","45 Bs","Milanesa de res acompaniada con papas fritas , limon y ensalada"},
            {"Paella","120 Bs", "Arroz, verduras, calamares, almejas, camarones "},
            {"Pique Macho", "60","Trozos de carne, salchichas ,papas fritas ,huevo ,locoto y tomate"}
    };
    int[] datosImagenes = {R.drawable.fetuccini_alfredo,R.drawable.lasania,R.drawable.milanesa,R.drawable.paella,R.drawable.pique};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista =  (ListView) findViewById(R.id.Lista);
        lista.setAdapter(new Adapter(this, datos,datosImagenes));
    }
}
