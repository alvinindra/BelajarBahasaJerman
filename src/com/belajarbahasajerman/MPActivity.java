package com.belajarbahasajerman;

import java.util.ArrayList;

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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MPActivity extends Activity {
	ListView listView1;
	Button btnback;
	private MediaPlayer mp;
	private Uri uri;
	ArrayList<String> listItems;
    ArrayAdapter<String> adapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.m_pembelajaran);
        btnback=(Button)findViewById(R.id.btnback1);
        uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.btn_klik);
        mp = MediaPlayer.create(this, uri);
        listView1=(ListView)findViewById(R.id.listView1);
        listItems = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, listItems);
        listView1.setAdapter(adapter);
        listItems.add("Modul 1 : \nMengenal bahasa Jerman");
        listItems.add("Modul 2 : \nSalam dan ungkapan dasar");
        listItems.add("Modul 3 : \nNomor dalam bahasa Jerman");
        listItems.add("Modul 4 : \nTentang waktu");
        
        listView1.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
            	if(position==0)
                {
            		Intent im = new Intent(MPActivity.this, modul_activity_0.class);
            		mp.start();
            		startActivity(im);
                    finish();
                }
                else if(position==1)
                {
                	Intent im1 = new Intent(MPActivity.this, modul_activity_0.class);
                	mp.start();
                	startActivity(im1);
                    finish();
                }
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
