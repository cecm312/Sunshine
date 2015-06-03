package edu.utcancun.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
        String [][] valores={
                {"Lunes","Soleado","30º/25ª"},
                {"Martes","Soleado","30º/25ª"},
                {"Miercoles","Soleado","30º/25ª"},
                {"Jueves","Soleado","30º/25ª"},
                {"Vierenes","Soleado","30º/25ª"}
        };
        List<String[]> lista=new ArrayList<String[]>(Arrays.as(valores));
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                lista
        );
        ListView listView=(ListView)rootView.findViewById(R.id.list_item_forecast);
        listView.setAdapter(adapter);
        return rootView;
    }
}
