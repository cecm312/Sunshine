package edu.utcancun.android.sunshine;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by carloschan on 02/06/15.
 */
public class customadapter extends ArrayAdapter{
    public customadapter(Context context, String[] resource) {
        super(context, R.layout.list_item_forecast,resource);

    }
}
