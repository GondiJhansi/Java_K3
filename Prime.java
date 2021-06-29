
import java .util.*;
public class Prime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int flag=1;
		if(num==0||num==1)
			System.out.println(num + " is not a Prime number");
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					System.out.println(num + " is not a Prime number");
					flag=0;
					break;
				}
				
			}
			if(flag==1)
				System.out.println(num + " is a Prime number");

		}

	}

}