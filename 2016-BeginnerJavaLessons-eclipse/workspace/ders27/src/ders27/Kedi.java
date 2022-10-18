package ders27;

public class Kedi extends Hayvan {

	@Override
	public void sesCıkar() {
		super.sesCıkar(); //extend edilen class a super class denir
		                  // mesela hayvan kedinin super class ıdır
		

		System.out.println("Miyav! Benim yaşım:" + yas);
	}

	
	
}
