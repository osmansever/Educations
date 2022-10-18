package ders28;

public class HayvanDene {

	public static void main(String[] args) {
		
		Hayvan h = new Hayvan("Hayvan 1",1);
		h.yuru();
		
		Kedi k = new Kedi("Boncuk",3,"Sütlü");
		k.yuru();
	
		
		k.yasSoyle();
		h.yasSoyle();
		
		k.sesCýkar();
		h.sesCýkar();
		
		
		

	}

}
