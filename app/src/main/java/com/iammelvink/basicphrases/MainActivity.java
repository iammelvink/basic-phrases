package com.iammelvink.basicphrases;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mPlayer;

    public void playPhrase(View view) {

        Button btnPressed = (Button) view;
        Log.i("Tag: ", btnPressed.getTag().toString());

        mPlayer = MediaPlayer.create(this, getResources().getIdentifier(
                btnPressed.getTag().toString(), "raw", getPackageName()));

        mPlayer.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
