package com.example.ugo.quakereport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* ArrayList<Quake> quakes = new ArrayList<Quake>();
        quakes.add(new Quake("7.2", "San Fransisco", "Feb 2, 2016"));
        quakes.add(new Quake("6.1", "London", "Jul 20, 2015"));
        quakes.add(new Quake("3.9", "Tokyo", "Nov 10, 2014"));
        quakes.add(new Quake("5.4", "Mexico City", "May 3, 2014"));
        quakes.add(new Quake("2.8", "Moscow", "Jan 31, 2012"));
        quakes.add(new Quake("4.9", "Rio De Janeiro", "Aug 19, 2012"));
        quakes.add(new Quake("1.6", "Paris", "Oct 30, 2011"));
        */
        ArrayList<Quake> quakes = QueryUtils.extractEarthquakes();
        //Create a new adapter that takes the list of earthquakes as input
        QuakeAdapter adapter = new QuakeAdapter(this,quakes);

        //Find a reference to the {@Link ListView} in the Layout
        ListView listView = (ListView) findViewById(R.id.list_list);

        //Ste the adapter on the ListView so the list can be populated in the user interface
        listView.setAdapter(adapter);

    }
}
