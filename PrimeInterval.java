
import java.util.*;
public class PrimeInterval
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Prime numbers are ");
		for(int s=num1;s<=num2;s++)
		{
			if(s==0||s==1)
				continue;
			else
			{
				int flag=1;
				for(int i=2;i<=s/2;i++)
				{
					if(s%i==0)
					{
						flag=0;
						break;
			

					}


				}
				if(flag==1)
					System.out.print( s + "  "); 

			}
		}
	}
}