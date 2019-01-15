package com.belajarbahasajerman;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class modul_activity_1 extends Activity {
	Button btnback;
	private MediaPlayer mp;
	private Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.modul_1);
        uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.btn_klik);
        mp = MediaPlayer.create(this, uri);
        btnback=(Button)findViewById(R.id.btnback2);
        
        btnback.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent ib = new Intent(modul_activity_1.this, MPActivity.class);
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
