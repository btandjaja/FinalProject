package com.btandjaja.www.displayjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

public class DisplayJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        String jokeString = getJoke();
        if (jokeString != null) {
            Toast.makeText(this, jokeString, Toast.LENGTH_SHORT).show();
        }
    }

    private String getJoke() {
        Intent intent = getIntent();
        String hasJoke = null;
        if (intent.hasExtra(getResources().getString(R.string.pass_by_value))) {
            hasJoke = intent.getStringExtra(getResources().getString(R.string.pass_by_value));
        }
        return !TextUtils.isEmpty(hasJoke) ? hasJoke : null;
    }
}
