package ders32;

public class OgrDene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Bil o1 = new MatOgr("Ay�e",21);
		Ogr o2 = new MatOgr("Ay�e",21);
		MatOgr o3 = new MatOgr("Hasan", 30);
		
		((Ogr) o1).adSoyle();
	
		o2.adSoyle();
		
		o3.adSoyle();
		
		
		
		((MatOgr) o2).bilgisayardaYaz();
		o3.bilgisayardaYaz();
		
		
		
	}

}
