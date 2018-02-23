package com.example.codewarrior928.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class OutdoorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        ArrayList<Destination> destinations = new ArrayList<Destination>();

        Destination charlesRiver = new Destination("Charles River", "A nature reservation covering 950 acres along both sides of the Charles River offers bicycle and jogging paths, 12 tennis courts, six swimming pools and the popular Hatch Memorial Shell with live concerts.", R.drawable.charles_river_picture);
        Destination bostonCommon = new Destination("Boston Common", "Whether it's a summer picnic in the grass or winter ice-skating on Frog Pond, Boston's oldest public park is the perfect escape from the bustle of the city.", R.drawable.boston_common_picture);
        Destination faneuilHall = new Destination("Faneuil Hall", "Located in the heart of downtown Boston, this bustling complex of novelty carts, distinctive shops, national chain stores, performers, food stands and restaurants brought new life to a historic meeting place.", R.drawable.faneuil_hall_picture);

        destinations.add(charlesRiver);
        destinations.add(bostonCommon);
        destinations.add(faneuilHall);

        ArrayAdapter<Destination> itemsAdapter = new DestinationAdapter(OutdoorsActivity.this, destinations);
        ListView outdoorsList = (ListView) findViewById(R.id.destinationRootView);
        outdoorsList.setAdapter(itemsAdapter);

        outdoorsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Creating intent to go to outdoors activity
                Intent FragmentIntent = new Intent(OutdoorsActivity.this, OutdoorFragmentActivity.class);

                // Executing intent
                startActivity(FragmentIntent);
            }
        });
    }




}
