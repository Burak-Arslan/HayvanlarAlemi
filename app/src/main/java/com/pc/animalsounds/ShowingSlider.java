package com.pc.animalsounds;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class ShowingSlider extends AppCompatActivity {
    public static MediaPlayer player = new MediaPlayer();
    private ViewPager viewPager;
    private SlideAdapter slideAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slide_show);
        Init();
        Slider();
    }

    private void Init() {
        try {
            viewPager = (ViewPager) findViewById(R.id.viewPager);
        } catch (Exception ex) {

        }
    }

    private void Slider() {
        try {
            slideAdapter = new SlideAdapter(this);
            viewPager.setAdapter(slideAdapter);
        } catch (Exception ex) {

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (player.isPlaying())
            player.stop();
    }
}
