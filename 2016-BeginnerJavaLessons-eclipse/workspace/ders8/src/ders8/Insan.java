package ders8;

public class Insan {

	private String isim;
    private int yas ;
	
     //Constructor e�er olu�turulmam��sa java bo� bir tane oldu�unu varsayar ve varsay�lan de�erler verir.
     // String i�in null int i�in 0 gibi
     public Insan()
     {
    	setIsim("isimsiz");
    	setYas(-1);
    	
     }
     
     public Insan(String alisim,int alyas)
     {
    	 setYas(alyas);
    	 setIsim(alisim);
    	 
     }
     
     public void selamla()
     {
    	 System.out.println("Merhaba, benim ad�m " + isim);
    	 
     }
     
     public void biriniselamla(String ad)
     {
    	System.out.println("Merhaba," + ad + " benim ad�m " + isim); 
    	 
     }
     
     public void biriniselamlav2(Insan gelenInsan)
     {
    	System.out.println("Merhaba," + gelenInsan.getIsim() + " benim ad�m " + isim); 
    	 
     }
     

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
}
