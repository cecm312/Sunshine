package edu.utcancun.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
        ArrayList<Pronostic> pronosticos=new ArrayList<Pronostic>();
        pronosticos.add(new Pronostic("Lunes","Nublado","20º/35º"));
        pronosticos.add(new Pronostic("Martes","Nublado","20º/35º"));
        pronosticos.add(new Pronostic("Miercoles","Nublado","20º/35º"));
        pronosticos.add(new Pronostic("Jueves","Nublado","20º/35º"));
        pronosticos.add(new Pronostic("Viernes","Nublado","20º/35º"));
        PronosticAdapter adapter=new PronosticAdapter(getActivity(),pronosticos);
        ListView listView=(ListView)rootView.findViewById(R.id.list_item_forecast);
        listView.setAdapter(adapter);
        return rootView;
    }
}
