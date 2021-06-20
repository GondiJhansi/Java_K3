/*
Output:
=======
E E E E E
D D D D
C C C
B B
A
*/

public class Pattern34
{
	public static void main(String[] args)
	{
		char ch='E';
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");


			}
			System.out.println();
			ch--;
		}
	}
}