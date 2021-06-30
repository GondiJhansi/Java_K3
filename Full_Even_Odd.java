
import java.util.*;
public class Full_Even_Odd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		int n = num;
		int f=1,d;
		while(num!=0)
		{
			d=num%10;
			if(n%2==0 && d%2==1)
			{
				f = 2;
				break;
			}
			else if(n%2==1 && d%2==0)
			{
				f = 2;
				break;
			}
			num=num/10;
		}
		if(f==1 && n%2==0)
			System.out.println("Full Even Number");
		else if(f==1 && n%2==1)
			System.out.println("Full Odd Number");
		else
			System.out.println("Mixed Number");
	}
}