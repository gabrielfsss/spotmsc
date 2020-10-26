package com.example.spotfyjava;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView musica;
    Button btnPlay;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        musica = (ImageView) findViewById(R.id.musica);
        Glide.with(this).load("https://img.youtube.com/vi/tc-bxi26GSA/0.jpg").into(musica);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.musicaandroid);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer.start();
    }
}
