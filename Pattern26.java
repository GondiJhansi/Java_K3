/*
Output:
=======
A
B A
C B A
D C B A
E D C B A
*/


public class Pattern26
{
	public static void main(String[] args)
	{	
		char ch1,ch2;
		ch1='A';
		for(int i=1;i<=5;i++)
		{
			ch2=ch1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch2+" ");
				ch2--;	
			}
			System.out.println();
			ch1++;			
		}
	}
}