/*
Output:
=======
    1
   22  
  333
 4444
55555
*/


public class Pattern38
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");

			}
			for(int n=1;n<=i;n++)
			{
				System.out.print(i);

			}						
			System.out.println();
		}
	}
}
