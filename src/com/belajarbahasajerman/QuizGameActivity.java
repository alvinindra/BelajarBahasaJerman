package com.belajarbahasajerman;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class QuizGameActivity extends Activity {
	Button btnback;
	private MediaPlayer mp;
	private Uri uri;
	TextView tvSoal;
    Button jaw1, jaw2, jaw3, jaw4;
    String[] soal = 
    	{"Bahasa Jerman 'Nama saya' adalah",
         "Ada berapa huruf di bahasa Jerman ?",
         "Angka tiga dalam bahasa Jerman yaitu",
         "Ich bin ... Jahre alt adalah menyatakan tentang",
         "Di bahasa Jerman mengucapkan selamat malam adalah",
         "Ketika berpisah dengan seseorang, kamu harus mengatakan(Formal) ?",
         "elf + vier adalah ",
         "Terima kasih dalam bahasa Jerman",
         "Sechs, sieben, acht, ... lanjutannya adalah",
         "Guten tag adalah ucapan pada saat ..."};
    int noSoal = 1;
    int[] jaw = new int[10];
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.quizgame);
        btnback=(Button)findViewById(R.id.btnback3);
        uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.btn_klik);
        mp = MediaPlayer.create(this, uri);
        tvSoal = (TextView)findViewById(R.id.Soal);
        jaw1 = (Button)findViewById(R.id.OptionA);
        jaw2 = (Button)findViewById(R.id.OptionB);
        jaw3 = (Button)findViewById(R.id.OptionC);
        jaw4 = (Button)findViewById(R.id.OptionD);
        
        tvSoal.setText(soal[noSoal-1]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
