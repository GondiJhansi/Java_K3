/*
Output:
========
E D C B A
D C B A
C B A
B A
A
*/


public class Pattern36                                                                                                            
{
	public static void main(String[] args)
	{
		char ch1,ch2;
		ch1='E';
		for(int i=5;i>=1;i--)
		{
			ch2=ch1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch2+" ");
				ch2--;
				
			}
			System.out.println();
			ch1--;
		}
	}
}