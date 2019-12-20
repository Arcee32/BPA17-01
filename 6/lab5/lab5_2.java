package lab4;

public class lab5_2 
{	
	public static int coldal(int n, int dol, int pol, char S[] ) { 
	
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
