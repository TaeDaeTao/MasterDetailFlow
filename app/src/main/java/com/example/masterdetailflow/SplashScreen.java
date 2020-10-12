package com.example.masterdetailflow;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Setting up intro music
        final MediaPlayer mdIntro = MediaPlayer.create(this, R.raw.intro_audio);
        mdIntro.start();

        //Launch main activity after 5 seconds
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                //Play intro music
                mdIntro.stop();
                //Switch activity
                finish();
                startActivity(new Intent(SplashScreen.this, ItemListActivity.class));
            }
        };
        Timer opening= new Timer();
        opening.schedule(task,5000);

    }
}