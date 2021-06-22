

import java.util.*;
public class NumberFactorial
{
	public static void main(String[] args)
	{
		Scanner se=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=se.nextInt();
		int f=1;
		for(int i=1;i<=num;i++)
		{
			f=f*i;

		}
		System.out.println("Factorial of "+num+" = "+f);
	}

}