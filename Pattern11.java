/*
Output:
=======
A B C D E
A B C D E 
A B C D E
A B C D E
A B C D E
*/

public class Pattern11
{
	public static void main(String[] args)
	{
		char ch;
		for(int i=1;i<=5;i++)
		{
			ch='A';
			for(int j=1;j<=5;j++)
			{
				System.out.print(ch+"  ");			
				ch++;
			}
			System.out.println();			

		}
	}

}