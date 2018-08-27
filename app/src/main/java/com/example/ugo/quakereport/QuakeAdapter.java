package com.example.ugo.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class QuakeAdapter extends ArrayAdapter<Quake>{

    public QuakeAdapter(Context context, List<Quake> quakes) {
        super(context, 0, quakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view called convertView we can reuse.
        //otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.quake_lay, parent, false);
        }

        //Find the quake at the given position in the list of quakes
        Quake currentQuake = getItem(position);

        // Lookup view for data population
        TextView first = (TextView) listItemView.findViewById(R.id.mag_no);

        //Display the magnitude of the current earthquake in that TextView
        first.setText(currentQuake.getMag());

        //Find the TextView with corresponding ID
        TextView sec = (TextView) listItemView.findViewById(R.id.locate);

        //Display the location of the current earthquake in that TextView
        sec.setText(currentQuake.getLocation());

        //Find the TextView with corresponding ID
        TextView third = (TextView) listItemView.findViewById(R.id.date_no);

        //Display the date of the current earthquake in that TextView
        third.setText(currentQuake.getDate());

        //Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
