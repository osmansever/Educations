package ders17;


public class Ders17 {

	public static void main(String[] args) {

		 
		PazarListesi liste = new PazarListesi(5);
		
		liste.listeyeEkle("Ekmek");
		liste.listeyeEkle("Bal");
		liste.listeyeEkle("S�t");
		liste.listeyeEkle("Re�el");
		liste.listeyeEkle("Yumurta");

		liste.yaz();
		
		liste.sondanSil();
		
		liste.yaz();
		


		
		liste.bastanSil();
		
		liste.yaz();
		
		
		liste.bastanSil();
		liste.yaz();

		
		liste.bastanSil();		liste.yaz();

		liste.bastanSil();		liste.yaz();

		liste.bastanSil();		liste.yaz();

		
		liste.yaz();
						
						
	}

}
