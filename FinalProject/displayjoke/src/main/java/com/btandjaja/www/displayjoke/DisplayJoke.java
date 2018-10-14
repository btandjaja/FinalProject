package com.btandjaja.www.displayjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayJoke extends AppCompatActivity {
    private TextView mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        mJoke = findViewById(R.id.tv_joke);
        String jokeString = getJoke();
        if (jokeString != null) {
            mJoke.setText(jokeString);
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
