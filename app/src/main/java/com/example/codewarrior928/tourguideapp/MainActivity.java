package com.example.codewarrior928.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating outdoors view that's linked to outdoors textview in mainActivity
        TextView outdoors = (TextView) findViewById(R.id.outdoors);

        // Setting onclick listener
        outdoors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Creating intent to go to outdoors activity
                Intent outdoorsIntent = new Intent(MainActivity.this, OutdoorsActivity.class);

                // Executing intent
                startActivity(outdoorsIntent);
            }
        });

        // Creating outdoors view that's linked to outdoors textview in mainActivity
        TextView attractions = (TextView) findViewById(R.id.attractions);

        // Setting onclick listener
        attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Creating intent to go to outdoors activity
                Intent attractionsIntent = new Intent(MainActivity.this, NeighborhoodsActivity.class);

                // Executing intent
                startActivity(attractionsIntent);
            }
        });

        // Creating outdoors view that's linked to outdoors textview in mainActivity
        TextView history = (TextView) findViewById(R.id.history);

        // Setting onclick listener
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Creating intent to go to outdoors activity
                Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);

                // Executing intent
                startActivity(historyIntent);
            }
        });

    }


}
