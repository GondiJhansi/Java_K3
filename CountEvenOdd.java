/*
Count of even and odd digits of a number
Input:1234567
Output:even digits=3
       odd digits=4
*/

import java.util.*;
public class CountEvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int even=0,odd=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			    even++;
			else
			    odd++;
			num=num/10;
		}
		System.out.println("Even Digits ="+even);
		System.out.println("Odd Digits ="+odd);
	}
}