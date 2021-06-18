/*
Outpu:
======
E
E D
E D C
E D C B
E D C B A
*/


public class Pattern24 
{
	public static void main(String[] args)
	{
		char ch='E';
		for(int i=1;i<=5;i++)
		{
			ch='E';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch--;

			}
			System.out.println();	
		}	
	}

}