package ders20;


public class Ders20 {
	
	public static void main(String[] args) {

		 
		PazarListesi liste = new PazarListesi(5);
		
		liste.listeyeEkle("Ekmek");
		liste.listeyeEkle("Bal");
		liste.listeyeEkle("Süt");
		liste.listeyeEkle("Reçel");
		liste.listeyeEkle("Yumurta");

		liste.yaz();
		

		liste.sil(0);

		liste.yaz();

		liste.ekle("Eklenen", 0); // 5. satıra eklendi.

		
		liste.yaz();
		
		liste.swap(0, 1);
		
		liste.yaz();

		liste.sil(0);
		liste.sil(0);
		liste.sil(0);
		liste.sil(0);
		liste.sil(0);
		liste.sil(0);
		
		liste.sil(100);

		
		
		liste.yaz();
		
		


		
		
						
	}

}
