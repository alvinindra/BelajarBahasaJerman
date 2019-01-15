package com.belajarbahasajerman;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizGameActivity extends Activity implements OnClickListener {
	Button btnback;
	private MediaPlayer mp;
	private Uri uri;
	TextView tvSoal;
    Button OptionA, OptionB, OptionC;
    int skor=0;
    int arr;
	int x; 
	Boolean clicked1=false,clicked2=false,clicked3=false;
	String jawaban;
	
	Soalpilihan soalPG = new Soalpilihan();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.quizgame);
        
        btnback=(Button)findViewById(R.id.btnback3);
        uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.btn_klik);
        mp = MediaPlayer.create(this, uri);
        tvSoal = (TextView)findViewById(R.id.Soal);
        OptionA = (Button)findViewById(R.id.OptionA);
        OptionB = (Button)findViewById(R.id.OptionB);
        OptionC = (Button)findViewById(R.id.OptionC);
        
        setKonten();
        OptionA.setOnClickListener(this);
        OptionB.setOnClickListener(this);
        OptionC.setOnClickListener(this);
        
    }
    
    @Override
    public void onClick(View v){
    	switch (v.getId()) {
    		case R.id.OptionA:
    			mp.start();
    			if(OptionA.getText().toString().equals(jawaban)){
    				skor = skor + 10;
    				Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
    				setKonten();
    			}else{
    				Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
    				setKonten();
    			}
				break;
    		case R.id.OptionB:
    			mp.start();
    			if(OptionB.getText().toString().equals(jawaban)){
    				skor = skor + 10;
    				Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
    				setKonten();
    			}else{
    				Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
    				setKonten();
    			}
				break;
    		case R.id.OptionC:
    			mp.start();
    			if(OptionC.getText().toString().equals(jawaban)){
    				skor = skor + 10;
    				Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
    				setKonten();
    			}else{
    				Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
    				setKonten();
    			}
				break;
    	}
    }
    
    public void setKonten(){
		arr = soalPG.pertanyaan.length;
		if(x >= arr){
			Intent i = new Intent(QuizGameActivity.this, HasilSkoring.class);
			i.putExtra("skorAkhir",skor);
			i.putExtra("activity","PilihanGanda");
			startActivity(i);
		}else{
			tvSoal.setText(soalPG.getPertanyaan(x));
			OptionA.setText(soalPG.getPilihanJawaban1(x));
			OptionB.setText(soalPG.getPilihanJawaban2(x));
			OptionC.setText(soalPG.getPilihanJawaban3(x));
			jawaban = soalPG.getJawabanBenar(x);

		}
		x++;
	}

}
