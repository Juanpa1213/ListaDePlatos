package com.jp.listadeplatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class descripcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);

        TextView nombre =(TextView)findViewById(R.id.nombre);
        ImageView imagen = (ImageView)findViewById(R.id.imagen);
        TextView precio =(TextView)findViewById(R.id.precio);
        TextView descripcion = (TextView) findViewById(R.id.descripcion);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        if(b!= null){
            nombre.setText(b.getString("nombre"));
            imagen.setImageResource(b.getInt("imagen"));
            precio.setText(b.getString("precio"));
            descripcion.setText(b.getString("descripcion"));
        }
    }
}
