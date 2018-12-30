package com.belajarbahasajerman;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class SplashActivity extends Activity {
    //Set time for splash screen
    private static int splashInterval=3000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            //Remove the Title Bar
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.splashscreen);

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run(){
                Intent i = new Intent(SplashActivity.this, MenuActivity.class);

                startActivity(i);
                finish();
                }
        }, splashInterval);
    }
}