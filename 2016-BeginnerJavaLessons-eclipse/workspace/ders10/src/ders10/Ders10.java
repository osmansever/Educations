package ders10;

import java.util.Scanner;

public class Ders10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Baþlangýç deðeri gir: ");
		
		a = sc.nextInt();
		System.out.print("Bitiþ deðeri gir: ");
		
		b = sc.nextInt();
		

	

		sayiSay(a,b);
		
		
	}

	
	public static void sayiSay(int bas,int son)
	{
		int i = bas;
		
		while(i <= son)
		{
			System.out.println(i);

			i = i + 1;
		}
				
		
	}
	
}
