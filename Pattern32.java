/*
Output:
========
A A A A A
B B B B
C C C
D D
E
*/


public class Pattern32
{
	public static void main(String[] args)
	{
		char ch='A';
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				
			}			
			System.out.println();
			ch++;



		}





	}




}