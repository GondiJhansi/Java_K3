/*
Output:
=======
E D C B A
E D C B
E D B
E D
E
*/

public class Pattern35
{
	public static void main(String[] args)
	{
		char ch;
		for(int i=5;i>=1;i--)
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