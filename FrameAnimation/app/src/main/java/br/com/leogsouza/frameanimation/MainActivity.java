package br.com.leogsouza.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable batAnimation;
    private ImageView batImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batImage = findViewById(R.id.batID);
        batImage.setBackgroundResource(R.drawable.bat_anim);
        batAnimation = (AnimationDrawable) batImage.getBackground();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        batAnimation.start();

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // stop the animation
                batAnimation.stop();
            }
        }, 5000);

        return super.onTouchEvent(event);
    }
}
