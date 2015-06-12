package edu.utcancun.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
        pronosticos.add(new Pronostic("Lunes","Soleado","20º/35º",R.drawable.soleado));
        pronosticos.add(new Pronostic("Martes","Soleado","20º/35º",R.drawable.soleado));
        pronosticos.add(new Pronostic("Miercoles","Llovizna","20º/35º",R.drawable.lloviendo));
        pronosticos.add(new Pronostic("Jueves","Soleado","20º/35º",R.drawable.soleado));
        pronosticos.add(new Pronostic("Viernes","Lovizna","20º/35º",R.drawable.lloviendo));
        PronosticAdapter adapter=new PronosticAdapter(getActivity(),pronosticos);
        ListView listView=(ListView)rootView.findViewById(R.id.list_item_forecast);
        listView.setAdapter(adapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View container, int position, long id) {
                TextView pronosticDay= (TextView) container.findViewById(R.id.pronostico_day);
                Toast.makeText(getActivity(),pronosticDay.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        };
        listView.setOnItemClickListener(itemClickListener);
        return rootView;

    }
}
