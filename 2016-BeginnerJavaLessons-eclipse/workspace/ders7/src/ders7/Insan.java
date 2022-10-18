package ders7;

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
