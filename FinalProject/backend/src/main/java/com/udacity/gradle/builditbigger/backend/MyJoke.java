package com.udacity.gradle.builditbigger.backend;

import com.btandjaja.www.jokelibrary.Jokes;

/** The object model for the data we are sending through endpoints */
public class MyJoke {
    private Jokes mJoke;

    public String getJoke() { return mJoke.randomJokes(); }
    public void setJoke() {
        mJoke = new Jokes();
    }
}
