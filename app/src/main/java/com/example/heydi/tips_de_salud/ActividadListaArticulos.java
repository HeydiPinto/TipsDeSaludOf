package com.example.heydi.tips_de_salud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.heydi.tips_de_salud.modeloA.ModeloArticulos;

/**
 * Actividad con la lista de artículos. Si el ancho del dispositivo es mayor o igual a 900dp, entonces
 * se incrusta el fragmento de detalle {@link FragmentoDetalleArticulo} para generar el patrón
 * Master-detail
 */



public class ActividadListaArticulos extends AppCompatActivity implements FragmentoListaArticulos.EscuchaFragmento {

@Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.actividad_lista_articulos);

    ((Toolbar) findViewById(R.id.toolbar)).setTitle(getTitle());

    //Agregar fragmento de lista
    getSupportFragmentManager().beginTransaction().replace(R.id.contenedor_lista, FragmentoListaArticulos.crear()).commit();
}
@Override
    public void alSeleccionarItem(String idArticulo){

}
}
