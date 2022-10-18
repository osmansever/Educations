package ders29;

public class Kedi extends Hayvan {
	String mamaTuru;
	
	public Kedi(String isim, int yas, String mamaTuru) {
		super(isim, yas);
		this.mamaTuru = mamaTuru;
		
	}

	@Override
	public void sesC�kar() {
		super.sesC�kar(); //extend edilen class a super class denir
		                  // mesela hayvan kedinin super class �d�r
		

		System.out.println("Miyav! Benim ya��m:" + yas + "Ben " + mamaTuru + " yerim.");
	}

	
	
}
