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
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MPActivity extends Activity {
	ListView listView1;
	Button btnback;
	private MediaPlayer mp;
	private Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.m_pembelajaran);
        listView1=(ListView)findViewById(R.id.listView1);
        btnback=(Button)findViewById(R.id.btnback1);
        uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.btn_klik);
        mp = MediaPlayer.create(this, uri);
        
        listView1.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
                Toast.makeText(getApplicationContext(),
                    "Click ListItem Number " + position, Toast.LENGTH_LONG)
                    .show();
            }
        });
        btnback.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent ib = new Intent(MPActivity.this, MenuActivity.class);
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
