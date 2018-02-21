package com.example.codewarrior928.tourguideapp;

/**
 * Created by codeWarrior928 on 2/10/2018.
 */

public class Destination {

    private String name;
    private String description;
    private int destinationPictureId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Destination(String name, String description, int pictureId) {
        this.name = name;
        this.description = description;
        this.destinationPictureId = pictureId;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDescription() {
        return description;
    }

    public int getDestinationPictureId() {
        return destinationPictureId;
    }

    public boolean  hasImage() {
        return destinationPictureId != NO_IMAGE_PROVIDED;
    }
}
