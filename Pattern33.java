/*
Output:
========
A B C D E
A B C D
A B C
A B
A
*/


public class Pattern33
{
	public static void main(String[] args)
	{
		char ch;
		for(int i=5;i>=1;i--)
		{
			ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
		
			}
			System.out.println();
		}
	}
}