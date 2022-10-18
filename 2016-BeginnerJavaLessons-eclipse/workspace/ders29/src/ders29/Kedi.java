package ders29;

public class Kedi extends Hayvan {
	String mamaTuru;
	
	public Kedi(String isim, int yas, String mamaTuru) {
		super(isim, yas);
		this.mamaTuru = mamaTuru;
		
	}

	@Override
	public void sesCýkar() {
		super.sesCýkar(); //extend edilen class a super class denir
		                  // mesela hayvan kedinin super class ýdýr
		

		System.out.println("Miyav! Benim yaþým:" + yas + "Ben " + mamaTuru + " yerim.");
	}

	
	
}
