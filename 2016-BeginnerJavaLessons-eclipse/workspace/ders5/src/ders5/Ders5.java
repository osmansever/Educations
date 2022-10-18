package ders5;

public class Ders5 {

	static int a = 7;
	
	public static void main(String[] args) {
		System.out.println("main blo�u " + a);

		yaz();
		methodlar("MeThoD"); // Burada parantezin i�ine string de�er verilmeli.
	                   // Do�rudan veya de�i�kene ba�l� olarak verilebilir.  
		methodlar("Method " + a);
		

  // Blok i�erisinde de�i�ken tan�ml� de�ilse program bir d�� bloktaki (class blo�unda)
  // de�i�keni kullan�r.
		
		returnmethod(5,4);
		System.out.println ("Return edilen:" + returnmethod(1,2));
		//burada return edilen de�ilken ekrana yazd�r�l�r
	}

	public static void yaz()
	{
		int a = 5;
		
		System.out.println("yaz blo�u " + a);
		
		ciz();
		
	}
	public static void ciz()
	
	{
		int a = 3;
		
		System.out.println("�iz blo�u " + a);

	}
	
	public static void methodlar(String method  )
	{
		System.out.println("methodlar blo�u " + method);

	}
	
	public static int returnmethod(int a, int b)
	{
		int c = a + b;
		System.out.println("returnmethod blo�u " + c );

		return c;

	}
}
