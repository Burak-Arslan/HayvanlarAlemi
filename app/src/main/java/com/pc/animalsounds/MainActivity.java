package com.pc.animalsounds;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    LinearLayout lnrRocket, lnrSpace;
    Button btnAbone;
    Animation updown, downUp;
    Switch swichSesAcKapa;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        Events();
    }

    private void Init() {
        try {
            lnrRocket = (LinearLayout) findViewById(R.id.lnrRocket);
            lnrSpace = (LinearLayout) findViewById(R.id.lnrSpace);
            btnAbone = (Button) findViewById(R.id.btnAbone);
            swichSesAcKapa = (Switch) findViewById(R.id.swichSesAcKapa);
            updown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.updown);
            downUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.downtoup);
            lnrSpace.setAnimation(updown);
            lnrRocket.setAnimation(downUp);
            mediaPlayer = new MediaPlayer();
        } catch (Exception ex) {

        }
    }

    private void Events() {
        try {

            btnAbone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), ShowingSlider.class);
                    startActivity(intent);
                }
            });

            swichSesAcKapa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        AudioManager mAudioManager = (AudioManager)getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
                        mAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 50 * 0 / 10, 0);
                        Toast.makeText(MainActivity.this, "Uygulamanın Sesini Kapattınız", Toast.LENGTH_SHORT).show();
                    } else {
                        AudioManager mAudioManager = (AudioManager)getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
                        mAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 50 * 4 / 10, 0);
                        Toast.makeText(MainActivity.this, "Uygulamanın Sesini Açtınız", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        } catch (Exception ex) {

        }
    }
}
