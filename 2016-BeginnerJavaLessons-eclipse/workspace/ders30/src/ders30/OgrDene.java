package ders30;

public class OgrDene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Ogr o1 = new FenOgr("Ali",19);
		Ogr o2 = new MatOgr("Ayþe",21);
		Ogr o3 = new Psiogr("Deniz",20);

		
		
		o1.adSoyle();
		o2.adSoyle();
		
		//o1.bil();
		//o2.bil();
		
		((FenOgr) o1).bil();
		((MatOgr) o2).hesapla();
		
		o1.bolumSoyle();
		o2.bolumSoyle();
		o3.bolumSoyle();
		
		
		
	}

}
