package com.example.codewarrior928.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NeighborhoodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        ArrayList<Destination> destinations = new ArrayList<Destination>();

        Destination brooklineVillage = new Destination("Brookline Village", "....", R.drawable.brooklinevillage);
        Destination southEnd = new Destination("South End", "...", R.drawable.south_end);
        Destination northEnd = new Destination("North End", "...", R.drawable.northend);

        destinations.add(brooklineVillage);
        destinations.add(southEnd);
        destinations.add(northEnd);

        ArrayAdapter<Destination> itemsAdapter = new DestinationAdapter(NeighborhoodsActivity.this, destinations);
        ListView neighborhoodList = (ListView) findViewById(R.id.destinationRootView);
        neighborhoodList.setAdapter(itemsAdapter);

        neighborhoodList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Creating intent to go to outdoors activity
                Intent FragmentIntent = new Intent(NeighborhoodsActivity.this, OutdoorFragmentActivity.class);

                // Executing intent
                startActivity(FragmentIntent);
            }
        });
    }
}
