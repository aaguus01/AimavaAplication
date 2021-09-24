package com.komprendo.redincidencias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.komprendo.redincidencias.Paginas.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cargarLogin();

    }


    /**
     * Muestra el contenido y da inicio a la pantalla de Inicio de Sesion
     */
    public void cargarLogin(){
        Intent loginIntent = new Intent(this, LoginActivity.class);
        startActivity(loginIntent);
    }


}