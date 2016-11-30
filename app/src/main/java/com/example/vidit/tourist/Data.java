package com.example.vidit.tourist;

/**
 * Created by vidit on 10/09/16.
 */
public class Data {

    private String mAddress;

    private String mName;

    private int mImageId;

    public Data(String name, String address, int imageId)
    {
        mName=name;

        mAddress=address;
        mImageId=imageId;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmName() {
        return mName;
    }

    public int getmImageId() {
        return mImageId;
    }

}
