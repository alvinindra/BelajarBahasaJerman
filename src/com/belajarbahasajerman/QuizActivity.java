package com.belajarbahasajerman;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class QuizActivity extends Activity {
	Button btnback,btnmulai;
	private MediaPlayer mp;
	private Uri uri;
	String global = null, Ques, Opta, Optb, Optc, Optd;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.quiz);
        btnback=(Button)findViewById(R.id.btnback4);
        btnmulai=(Button)findViewById(R.id.btnMulai);
        uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.btn_klik);
        mp = MediaPlayer.create(this, uri);
        
        btnmulai.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent im = new Intent(QuizActivity.this, QuizGameActivity.class);
				mp.start();
                startActivity(im);
                finish();
			}
        });
        btnback.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent ib = new Intent(QuizActivity.this, MenuActivity.class);
				mp.start();
                startActivity(ib);
                finish();
			}
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
