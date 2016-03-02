package com.example.rivanildo.ssegundoroteiro;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Runnable{

    private static final int DELAY = 7000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        ImageView img = (ImageView)findViewById(R.id.imageView);

        ObjectAnimator a = ObjectAnimator.ofFloat(img, "alpha",0f,1f);
        a.setDuration(3500);
        TextView txt = (TextView)findViewById(R.id.textView);
        ObjectAnimator b = ObjectAnimator.ofFloat(txt, "alpha",1f,0f);
        b.setDuration(3000);
        b.start();
        a.start();
        handler.postDelayed(this, DELAY);
    }

    @Override
    public void run() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
