package ders15;

import java.util.Scanner;

public class Ders15 {

	public static void main(String[] args) {
		
		// TODO Array (diziler) indisler0 dan baþlar belirtilenin bir
		//öncesine kadar devam eder.

		/*int[] a = new int[10];
		
		for ( int i=0 ; i<10 ;i++)
		{
			a[i] = i*i;
		
		}
		for (int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}*/
		
		int[] a = new int[10];
		
		int sonuc = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ;i<5 ;i++)
		{
			System.out.print((i+1) + ". Sayýyý gir: ");
			a[i] = sc.nextInt();
		}
		for (int j = 0; j<5;j++)
		{
			sonuc = sonuc + a[j];
			
		}
		System.err.println("Toplam: " + sonuc);
		
	}

}
