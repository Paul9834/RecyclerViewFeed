package com.example.recyclerviewforexamplelist;

public class Tarjetas {

    private String mImageUrl;
    private String mCreator;
    private int mLikes;

    public Tarjetas(String mImageUrl, String mCreator, int mLikes) {
        this.mImageUrl = mImageUrl;
        this.mCreator = mCreator;
        this.mLikes = mLikes;

    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreator() {
        return mCreator;
    }

    public int getLikeCount() {
        return mLikes;
    }
}
