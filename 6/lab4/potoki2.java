package lab3;

import java.util.Scanner;

public class potoki2 
{
	static int dol;
	public static int coldal(int n, char S[] )
	{ 
		
		int pol=0;
		
	if((n>=2)&&(n<=10*403.42879))
	{
		for(int i=0; i<n; i++)
		{
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
	return dol;
}
}