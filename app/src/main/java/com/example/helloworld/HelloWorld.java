package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.TextView;

public class HelloWorld extends AppCompatActivity {

    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld);

        //Creo el objeto tvMessage y le asigno la memoria por el método findViewById() del TextView mediante su id.
        tvMessage= findViewById(R.id.tvMessage);
        //Modifico el texto de tvMessage
        //1ºOpcion:
        tvMessage.setText(R.string.msgByebye);

        /*2ªOpcion: Esta sobrecarga pide un CharSequence como parámetro.
         ¿Cómo lo obtengo?
         Mediante el método getResources(), obtiene un Recurso de la clase R, y le digo obtén un texto y devuélmelo como un CharSequence con getText(). Le doy como parámetro la memoria del string,
          que es R.string.msgByeBye*/
        //tvMessage.setText(getResources().getText(R.string.msgByebye));

        //Cambiamos el color de la misma manera que antes
        //El método getColor() recomienda no utilizarse porque es una API anticuada (API 23), entonces nos dice que utilicemos la clase ContextCompat (lo utilizaremos siempre para los colores)
        //tvMessage.setTextColor(getResources().getColor(R.color.dark_grey));
        tvMessage.setTextColor(ContextCompat.getColor(this,R.color.redtvMessage));

    }
}