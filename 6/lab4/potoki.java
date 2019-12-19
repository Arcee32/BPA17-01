package lab3;

import java.util.Scanner;

class potoki4
implements Runnable
{
	public void run()
	{
		int out = potoki2 .coldal(potoki.n, potoki.S);
		System.out.println("Количество долин = "+potoki2.dol);
	}
}

public class potoki 
{
	static potoki4 mThing;
	static int n;
	static char S[];
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Введите число элементов в строке");		
		int n = sc.nextInt();
		int dol=0;
		char[] S = new char[n+1];
		
		System.out.println("Введите massiv");
		
		for(int j=0; j<=n-1; j++)
		{
			S[j] = sc.next().charAt(0);
		}
		
		mThing = new potoki4();
		Thread mypot = new Thread(mThing);
		mypot.start();
				
		dol = potoki2 .coldal(n, S);
		
			System.out.println("Количество долин = "+dol);
		}
}