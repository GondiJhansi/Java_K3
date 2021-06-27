
import java.util.*;
public class Max_Min
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int rem,min,max;
		rem=num%10;
		min=rem;
		max=rem;
		while(num>0)
		{
			rem=num%10;
			if(rem<min)
				min=rem;
			if(rem>max)
				max=rem;
			num=num/10;
		}
		System.out.println("Minimum digit is "+min);
		System.out.println("Maximum digit is "+max);
	}
}