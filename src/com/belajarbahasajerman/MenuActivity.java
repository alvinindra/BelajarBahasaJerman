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

public class MenuActivity extends Activity {

	Button btnModul,btnImportant,btnQuiz;
	private MediaPlayer mp;
	private Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
      //Remove the Title Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.menu);
        btnModul=(Button)findViewById(R.id.btnModul);
        btnImportant=(Button)findViewById(R.id.btnImportant);
        btnQuiz=(Button)findViewById(R.id.btnQuiz);
        uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.btn_klik);
        mp = MediaPlayer.create(this, uri);
        
        btnModul.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent mo = new Intent(MenuActivity.this, MPActivity.class);
				mp.start();
                startActivity(mo);
                finish();
			}
        });
        btnImportant.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent im = new Intent(MenuActivity.this, ImportantActivity.class);
				mp.start();
                startActivity(im);
                finish();
			}
        });
        btnQuiz.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent qu = new Intent(MenuActivity.this, QuizActivity.class);
				mp.start();
                startActivity(qu);
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
