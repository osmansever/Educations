package ders9;

public class Ders9 {
	
	public static void main(String args[])
	{
		Insan i3 = new Insan("Osman",21);
		Insan i4 = new Insan("Buse",18);
		
		Bisiklet b1 = new Bisiklet();

		b1.in();
		b1.bin(i4);
		b1.bin(i3);
		b1.in();
		b1.bin(i3);
		b1.in();
		
	}
}
