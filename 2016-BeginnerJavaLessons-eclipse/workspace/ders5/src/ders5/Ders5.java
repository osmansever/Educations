package ders5;

public class Ders5 {

	static int a = 7;
	
	public static void main(String[] args) {
		System.out.println("main bloðu " + a);

		yaz();
		methodlar("MeThoD"); // Burada parantezin içine string deðer verilmeli.
	                   // Doðrudan veya deðiþkene baðlý olarak verilebilir.  
		methodlar("Method " + a);
		

  // Blok içerisinde deðiþken tanýmlý deðilse program bir dýþ bloktaki (class bloðunda)
  // deðiþkeni kullanýr.
		
		returnmethod(5,4);
		System.out.println ("Return edilen:" + returnmethod(1,2));
		//burada return edilen deðilken ekrana yazdýrýlýr
	}

	public static void yaz()
	{
		int a = 5;
		
		System.out.println("yaz bloðu " + a);
		
		ciz();
		
	}
	public static void ciz()
	
	{
		int a = 3;
		
		System.out.println("çiz bloðu " + a);

	}
	
	public static void methodlar(String method  )
	{
		System.out.println("methodlar bloðu " + method);

	}
	
	public static int returnmethod(int a, int b)
	{
		int c = a + b;
		System.out.println("returnmethod bloðu " + c );

		return c;

	}
}
