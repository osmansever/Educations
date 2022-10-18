package ders16;

public class Ders16 {

	public static void main(String[] args) {

		 
		PazarListesi liste = new PazarListesi(5);
		
		liste.listeyeEkle("Ekmek");
		liste.listeyeEkle("Bal");
		liste.listeyeEkle("Süt");

		liste.yaz();
		
						
						
	}

}
