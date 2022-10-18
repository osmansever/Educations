package ders29;

public class HayvanDene {

	public static void main(String[] args) {
		
		Hayvan h = new Hayvan("Hayvan 1",1);
		Kedi k = new Kedi("Boncuk",3,"Sütlü");
		
		System.out.println(h.islemYap(3, 5));
		
		k.sesCýkar();
		
		
		
		

	}

}
