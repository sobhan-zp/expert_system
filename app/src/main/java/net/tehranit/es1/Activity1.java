package net.tehranit.es1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class Activity1 extends Activity {

    public Typeface font1;
    public Typeface font2;
    public Typeface font3;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        TextView txtw = (TextView) findViewById(R.id.txtw);
        TextView txt_touch = (TextView) findViewById(R.id.txt_touch);
        font1 = Typeface.createFromAsset(getAssets(), "f1.ttf");
        font2 = Typeface.createFromAsset(getAssets(), "f2.ttf");
        font3 = Typeface.createFromAsset(getAssets(), "f3.ttf");
        txtw.setTypeface(font3);
        txt_touch.setTypeface(font3);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.wellcom_text);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.touch_txt);
        txtw.startAnimation(animation);
        txt_touch.startAnimation(animation1);
        txt_touch.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent myintent = new Intent(Activity1.this, Activity2.class);
                Activity1.this.startActivity(myintent);
                Activity1.this.finish();
            }
        });

    }
}