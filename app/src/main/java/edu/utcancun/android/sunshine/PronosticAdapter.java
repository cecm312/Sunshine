package edu.utcancun.android.sunshine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by carloschan on 02/06/15.
 */
public class PronosticAdapter extends ArrayAdapter<Pronostic>{
    public PronosticAdapter(Context context, ArrayList<Pronostic> pronosticos) {
        super(context,0,pronosticos);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        Pronostic pronostico=getItem(position);
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_item_forecast,parent,false);
        }
        TextView pronosticDay=(TextView)convertView.findViewById(R.id.pronostico_day);
        TextView pronosticStatus=(TextView)convertView.findViewById(R.id.pronostico_status);
        TextView pronosticTemperatures=(TextView)convertView.findViewById(R.id.pronostico_temperatures);
        pronosticDay.setText(pronostico.day);
        pronosticStatus.setText(pronostico.status);
        pronosticTemperatures.setText(pronostico.temperatures);
        return convertView;
    };

}
