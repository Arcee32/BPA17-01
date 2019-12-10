package lab1;

import java.util.Scanner;

public class dolina {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Введите число элементов в строке");		
		int n = sc.nextInt();
		int dol=0;
		int pol=0;
		char[] S = new char[n+1];
		//String input;
		//String[] S = {"U","D","D","D","U","D","U","U"};
		
		System.out.println("Введите massiv");
		
		for(int j=0; j<=n-1; j++)
		{
			S[j] = sc.next().charAt(0);
			//input = sc.nextLine();
            //S[j++] = input;
		}
		
		//sc.close();		
		
		if((n>=2)&&(n<=10*403.42879))
		{
			for(int i=0; i<n; i++)
			{
				//S[i]=sc.nextLine();
				if(n!=i)
				{			
					if(S[i]=='D')
					{
						pol--;
					}
					else
					{
						pol++;
					}					
					if((pol==0)&&(S[i]=='U'))
						dol++;	
				}
			}
		}
			System.out.println("Количество долин ="+dol);
		}
}	

