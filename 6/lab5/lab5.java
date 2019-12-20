package lab4;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*; 
import java.io.IOException; 
import lab4.lab5_2;

public class lab5 
{
	
	public static void main(String[] args)  throws SecurityException, IOException 
	{
		
		 Logger logger 
         = Logger.getLogger( 
             lab5.class.getName()); 
		try
		{
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
			
			dol = lab5_2.coldal(n, dol, pol, S);
			
				System.out.println("Количество долин ="+dol);
		}
		
		catch(Exception e)
		{
			System.out.println("ошибка");
			  FileHandler handler = new FileHandler("logs.txt"); 
	
		        logger.addHandler(handler); 
		 
		        logger.info("This is Info Messsage "); 
		        logger.log(Level.WARNING, 
		                   "Warning Message"); 
		}		
	}
}
