package lab2;

import java.util.Scanner;

public class class1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Введите число элементов в строке");		
		int n = sc.nextInt();
		int dol=0;
		int pol=0;
		char[] S = new char[n+1];
		
		System.out.println("Введите massiv");
		
		for(int j=0; j<=n-1; j++)
		{
			S[j] = sc.next().charAt(0);
		}
			
		dol = class2.coldal(n, dol, pol, S);
		
			System.out.println("Количество долин ="+dol);
		}
}
