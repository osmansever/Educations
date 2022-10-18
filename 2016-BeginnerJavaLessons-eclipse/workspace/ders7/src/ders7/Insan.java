package ders7;

public class Insan {

	private String isim;
    private int yas ;
	
     //Constructor eðer oluþturulmamýþsa java boþ bir tane olduðunu varsayar ve varsayýlan deðerler verir.
     // String için null int için 0 gibi
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
