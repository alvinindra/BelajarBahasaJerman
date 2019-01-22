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
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class modul_activity_2 extends Activity {
	Button btnback;
	private MediaPlayer mp;
	private Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.modul_2);
        uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.btn_klik);
        mp = MediaPlayer.create(this, uri);
        btnback=(Button)findViewById(R.id.btnback2);
        
        btnback.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent ib = new Intent(modul_activity_2.this, MPActivity.class);
				mp.start();
                startActivity(ib);
                finish();
			}
        });
        
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(Uri.parse("file:///android_asset/modul3.html").toString());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
