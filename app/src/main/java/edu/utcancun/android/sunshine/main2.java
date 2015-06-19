package edu.utcancun.android.sunshine;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class main2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        Pronostic pronostico = (Pronostic)i.getSerializableExtra("pronostico");

        setContentView(R.layout.activity_main2);
        TextView dia= (TextView) findViewById(R.id.txtDay);
        TextView estado= (TextView) findViewById(R.id.txtStatus);
        TextView temperatura= (TextView) findViewById(R.id.txtTemperature);
        ImageView icono= (ImageView) findViewById(R.id.imgIcono);
        dia.setText(pronostico.getDay());
        estado.setText(pronostico.getStatus());
        temperatura.setText(pronostico.getTemperatures());
        icono.setImageResource(pronostico.getImg());
    }
}
