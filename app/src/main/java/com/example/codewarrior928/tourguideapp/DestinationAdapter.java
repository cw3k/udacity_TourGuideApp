package com.example.codewarrior928.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by codeWarrior928 on 2/11/2018.
 */

public class DestinationAdapter extends ArrayAdapter<Destination> {
    public DestinationAdapter(@NonNull Context context, ArrayList<Destination> destinations) {
        super(context, 0, destinations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View destinationListItem = convertView;
        if(destinationListItem == null) {
            destinationListItem = LayoutInflater.from(getContext()).inflate(R.layout.destination_item, parent, false);
        }

        Destination currentDestination = getItem(position);

        TextView nameTextView = (TextView) destinationListItem.findViewById(R.id.destinationName);
        nameTextView.setText(currentDestination.getName());

        TextView descriptionTextView = (TextView) destinationListItem.findViewById(R.id.destinationDescription);
        descriptionTextView.setText(currentDestination.getDescription());

        ImageView destinationPicture = (ImageView) destinationListItem.findViewById(R.id.destination_image);
        if (currentDestination.hasImage()) {
            Log.e("destination", currentDestination.getName());
            destinationPicture.setImageResource(currentDestination.getDestinationPictureId());
            destinationPicture.setVisibility(View.VISIBLE);
        } else {
            destinationPicture.setVisibility(View.GONE);
        }

        return destinationListItem;
    }


}
