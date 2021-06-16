/*
Output:
=======
EDCBA
EDCBA
EDCBA
EDCBA
EDCBA
*/

public class Pattern13
{
	public static void main(String[] args)
	{
		char ch='E';
		for(int i=1;i<=5;i++)
 		{	
			ch='E'; 
			for(int j=1;j<=5;j++)
			{
				System.out.print(ch);
				ch--;
			}
			System.out.println();
			
		}

	}

}