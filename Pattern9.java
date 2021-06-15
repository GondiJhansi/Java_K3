/*
Output:
=======
2  4  6  8  10  
12 14 16 18 20
22 24 26 28 30
32 34 36 38 40
42 44 46 48 50
*/

public class Pattern9
{
	public static void main(String[] args)
	{
		int count=2;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(count<10)
				{
					System.out.print(count+"  ");
					count=count+2;		
				}
				else
				{
					System.out.print(count+" ");
					count=count+2;		
				}
			}	
			System.out.println();

		}

	}
}