package com.belajarbahasajerman;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HasilSkoring extends Activity {
	private MediaPlayer mp;
	private Uri uri;
	TextView tvHasilAkhir;
	Button btnHome;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.skor);

		tvHasilAkhir = (TextView) findViewById(R.id.tvSkorAkhir);
		btnHome = (Button) findViewById(R.id.btnMenu);
		
		int skorQuiz = getIntent().getIntExtra("skorAkhir",0);
		if(skorQuiz>=70 && skorQuiz<=100){
			uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.winquiz);
			mp = MediaPlayer.create(HasilSkoring.this,uri);
			mp.start();
		}else{
			uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.failquiz);
			mp = MediaPlayer.create(HasilSkoring.this,uri);
			mp.start();
		}
		String skorString = String.valueOf(skorQuiz);
		tvHasilAkhir.setText("SKOR : "+skorString);
		btnHome.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.btn_klik);
				mp = MediaPlayer.create(HasilSkoring.this,uri);
				mp.start();
				Intent i = new Intent(HasilSkoring.this, MenuActivity.class);
				startActivity(i);
			}
		});
	}
	
	public void onBackPressed(){
		Toast.makeText(this, "Tidak bisa kembali, silahkan tekan home", Toast.LENGTH_SHORT).show();
	}
}