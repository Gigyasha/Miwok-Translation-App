package com.example.android.miwok;

public class Word {
    private String baseTranslation;
    private String miwokTranslation;
    private int imageId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String baseTranslation,String miwokTranslation,int imageId){
        this.baseTranslation=baseTranslation;
        this.miwokTranslation=miwokTranslation;
        this.imageId=imageId;

    }
    //another constructor because in the phrases activity we are not using the image
    public Word(String baseTranslation,String miwokTranslation){
        this.baseTranslation=baseTranslation;
        this.miwokTranslation=miwokTranslation;
    }

    public String getBaseTranslation() {
        return baseTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImageId() {
        return imageId;
    }

    public boolean hasImage() {
        return imageId != NO_IMAGE_PROVIDED;
    }
}
