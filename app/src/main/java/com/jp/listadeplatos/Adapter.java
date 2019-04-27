package com.jp.listadeplatos;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {
    private static LayoutInflater inflater =null;

    Context  mContext;
    String[][] datos ;
    int[] datosImagenes;

    public Adapter(Context mContext, String[][] datos, int[] datosImagenes) {
        this.mContext = mContext;
        this.datos = datos;
        this.datosImagenes = datosImagenes;

        inflater =(LayoutInflater) mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final  View vista = inflater.inflate(R.layout.elemento_lista,null);
        TextView nombre = (TextView) vista.findViewById(R.id.nombre);
        TextView precio = (TextView) vista.findViewById(R.id.precio);
        TextView descripcion;
        ImageView imagen = (ImageView)vista.findViewById(R.id.imagen);

        nombre.setText(datos[position][0]);
        precio.setText(datos[position][1]);
        imagen.setImageResource(datosImagenes[position]);


        return vista;
    }
    @Override
    public int getCount() {
        return datosImagenes.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
