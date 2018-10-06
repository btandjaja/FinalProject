package com.btandjaja.www.jokes;

import java.util.Random;

public class Joke {
    private String[] mJokes;
    private int mCount;

    public Joke() {
        mJokes = new String[] { "My name is Microsoft. Can I crash at your place tonight?",
        "You are like my dentures. I cannot smile without you.",
        "You are just like my car because you drive me crazy.",
        "Why do man like to fall in love at first sight? Because doing so saves them a lot of money.",
        "Falling in love is like going deep into a river. It is much easier to get in it than it is to get out of it.",
        "Never laugh at your significant other’s choices because you happen to be one of them.",
        "I don’t know your name yet, but it must be Wi-Fi because I am feeling such a strong connection here.",
        "What is S.C.H.O.O.L an acronym for? Seven crappy hours of our life."};

        mCount = mJokes.length;
    }

    public String randomJokes() {
        int randomNumber = new Random().nextInt(mCount);
        return mJokes[randomNumber];
    }
}
