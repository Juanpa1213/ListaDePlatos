package com.jp.listadeplatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class descripcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);

        TextView nombre =(TextView)findViewById(R.id.nombre);
        TextView descripcion = (TextView) findViewById(R.id.descripcion);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        if(b!= null){
            nombre.setText(b.getString("nombre"));
            descripcion.setText(b.getString("descripcion"));
        }
    }
}
