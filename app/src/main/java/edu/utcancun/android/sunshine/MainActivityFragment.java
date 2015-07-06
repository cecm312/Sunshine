package edu.utcancun.android.sunshine;

import android.content.Intent;
import android.net.Uri;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_main, container, false);
        /*List<String[]> lista=new ArrayList<String[]>(Arrays.as(valores));
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                lista
        );*/
        final ArrayList<Pronostic> pronosticos=new ArrayList<Pronostic>();
        pronosticos.add(new Pronostic("Lunes","Soleado","20º/35º",R.drawable.soleado));
        pronosticos.add(new Pronostic("Martes","Soleado","20º/35º",R.drawable.soleado));
        pronosticos.add(new Pronostic("Miercoles","Llovizna","20º/35º",R.drawable.lloviendo));
        pronosticos.add(new Pronostic("Jueves","Soleado","20º/35º",R.drawable.soleado));
        pronosticos.add(new Pronostic("Viernes", "Lovizna", "20º/35º", R.drawable.lloviendo));
        HttpURLConnection con = null ;
        InputStream is = null;
        String data="no data";
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        try {
            con = (HttpURLConnection) ( new URL("http://api.openweathermap.org/data/2.5/forecast/daily?APPID=143ffc47ae963adf95c8e2a4ccf660e3&q=Cancun&cnt=5&mode=json&units=metric")).openConnection();
            con.setRequestMethod("GET");
            con.connect();

        }
        catch(Throwable t) {
            t.printStackTrace();
        }
        finally {
            try { is.close(); } catch(Throwable t) {}
            try { con.disconnect(); } catch(Throwable t) {}
        }




        PronosticAdapter adapter=new PronosticAdapter(getActivity(),pronosticos);
        ListView listView = (ListView)rootView.findViewById(R.id.list_item_forecast);
        listView.setAdapter(adapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View container, int position, long id) {

                Intent intate=new Intent(getActivity(),main2.class);
                intate.putExtra("pronostico", pronosticos.get(position));
                startActivity(intate);

            }
        };
        listView.setOnItemClickListener(itemClickListener);
        return rootView;

    }
}
