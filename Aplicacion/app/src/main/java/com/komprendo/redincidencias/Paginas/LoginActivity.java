package com.komprendo.redincidencias.Paginas;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.komprendo.redincidencias.R;


public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //--------------------------------------------
        // Elementos visuales
        //--------------------------------------------

        //Este boton se encargará de realizar las comprobaciones necesarias antes de iniciar sesion
        Button acceder = (Button)findViewById(R.id.acceder);


        //--------------------------------------------
        // Eventos
        //--------------------------------------------

        //Este evento se disparará al hacer click en el boton de Acceder
        acceder.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Se deberá llamar al login dentro del paquete "App"
            }
        });





    }


    @Override
    public void onBackPressed() {
        ExitDialog exit=new ExitDialog(LoginActivity.this);
        exit.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        exit.show();
    }
}
