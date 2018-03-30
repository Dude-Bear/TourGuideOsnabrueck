package com.example.android.tourguideosnabrueck;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */
public class Word {


    /** String resource ID for the name of the location */
    private int mLocationNameId;

    /** String resource ID for the address of the location */
    private int mLocationAddressId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param locationNameId is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param locationAddressId is the string resource Id for the word in the Miwok language
     */
    public Word(int locationNameId, int locationAddressId) {
        mLocationNameId = locationNameId;
        mLocationAddressId = locationAddressId;
    }

    /**
     * Create a new Word object.
     *
     * @param locationNameId is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param locationAddressId is the string resource Id for the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Word(int locationNameId, int locationAddressId, int imageResourceId) {
        mLocationNameId = locationNameId;
        mLocationAddressId = locationAddressId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getLocationNameId() {
        return mLocationNameId;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public int getLocationAddressId() {
        return mLocationAddressId;
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
