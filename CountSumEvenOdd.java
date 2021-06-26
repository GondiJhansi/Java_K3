/*
Count Sum of Even and Odd digits of a given number
*/

import java.util.*;
public class CountSumEvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int rem;
		int even=0,odd=0;
		int even_sum=0,odd_sum=0;
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{
			    even++;			 
			    even_sum=even_sum+rem;
			}
			else
			{
			    odd++;
			    odd_sum=odd_sum+rem;
			}
			num=num/10;
		}
		System.out.println("Even Digits="+even);
		System.out.println("Even_Sum is ="+even_sum);
		System.out.println("Odd Digits="+odd);
		System.out.println("Odd_Sum is ="+odd_sum);
		
	}
}