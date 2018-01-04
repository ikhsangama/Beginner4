package com.example.android.miwok;

/**
 * Created by Ikhsan on 1/4/2018.
 */

public class Word {

    /*Default translation for the word*/
    private String mDefaultTranslation;

    /*Miwok translation for the word*/
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /*
    Get the default translation of the word
    */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /*
    Get the Miwok translation of the word
    */
    public String getMiwokTranslation(){
        return mDefaultTranslation;
    }
}
