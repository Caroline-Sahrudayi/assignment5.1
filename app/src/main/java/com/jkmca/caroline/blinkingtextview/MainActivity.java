package com.jkmca.caroline.blinkingtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button blink;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blink = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textview1);
        /*creating onclicklistener for the button*/

        blink.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                /*loading the anim.xml file*/
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim);
                textView.startAnimation(animation);
            }
        });
    }
}
