package com.example.android.tourguideapp;

/**
 * {@link Word} represents aview where a place or event that is described.
 * It contains the name of the place/event, the adress of that place, and an image for that place/event.
 */
public class Word {

    /**
     * Place name
     */
    private String placeNames;

    /**
     * Place adress
     */
    private String placeAdresses;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param placeName       is the name of the place that is presented
     * @param placeAdress     is the adress of said place
     * @param imageResourceId is the drawable resource ID for the image associated with the place
     */
    public Word(String placeName, String placeAdress, int imageResourceId) {
        placeNames = placeName;
        placeAdresses = placeAdress;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the place.
     */
    public String getPlaceNames() {
        return placeNames;
    }

    /**
     * Get the adress of the place.
     */
    public String getPlaceAdresses() {
        return placeAdresses;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}