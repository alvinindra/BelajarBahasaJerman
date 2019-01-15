package com.belajarbahasajerman;

public class Soalpilihan {
	public String pertanyaan[] = 
    	{" Bahasa Jerman 'Nama saya' adalah ",
         " Ada berapa huruf yang ada di bahasa Jerman ? ",
         " Angka tiga dalam bahasa Jerman yaitu ",
         " Ich bin ... Jahre alt adalah menyatakan tentang ",
         " Di bahasa Jerman mengucapkan selamat malam adalah ",
         " Ketika berpisah dengan seseorang, kamu harus mengatakan(dalam formal) ? ",
         " elf + vier adalah ",
         " Terima kasih dalam bahasa Jerman ",
         " Sechs, sieben, acht, ... lanjutannya adalah ",
         " Guten tag adalah ucapan pada saat ? ",
    };
    
    private String pilihjaw[][] = {
			{"Ich heiﬂe","Ich komme","Ich reise mit"},
			{"26 huruf","28 huruf","30 huruf"},
			{"drei","thri","zwei"},
			{"Saya berasal","Nama saya","Umur saya"},
			{"Guten Tag","Gute Nacht","Guten Morgen"},
			{"Tschuss","Auf Wiedersehen","Gute bay"},
			{"15","14","16"},
			{"Bitte","Danke","Sankyu"},
			{"Zehn","Funf","Neun"},
			{"Selamat siang","Selamat malam","Selamat pagi"},
	};
    
    private String jawbenar[] = {
			"Ich heiﬂe",
			"30 huruf",
			"drei",
			"Umur saya",
			"Gute Nacht",
			"Auf Wiedersehen",
			"15",
			"Danke",
			"Neun",
			"Selamat siang",
	};
    
    public String getPertanyaan(int x){
		String soal = pertanyaan[x];
		return soal;
	}

	public String getPilihanJawaban1(int x){
		String jawaban1 = pilihjaw[x][0];
		return jawaban1;
	}

	public String getPilihanJawaban2(int x){
		String jawaban2 = pilihjaw[x][1];
		return jawaban2;
	}

	public String getPilihanJawaban3(int x){
		String jawaban3 = pilihjaw[x][2];
		return jawaban3;
	}

	public String getJawabanBenar(int x){
		String jawaban = jawbenar[x];
		return jawaban;
	}
}
