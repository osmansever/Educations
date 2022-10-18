package ders27;

public class HayvanDene {

	public static void main(String[] args) {
		
		Hayvan h = new Hayvan();
		h.yuru();
		
		Kedi k = new Kedi();
		k.yuru();
		
		k.yas = 19;
		h.yas = 10;
		
		k.yasSoyle();
		h.yasSoyle();
		
		k.sesCýkar();
		h.sesCýkar();
		
		
		

	}

}
