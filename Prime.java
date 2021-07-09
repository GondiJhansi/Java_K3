
public class Prime
{
	public static void main(String[] args)
	{
		long n=24;
		if(n==2)
		  System.out.println(1);
		int i,result=0;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				result++;
				break;
			}
		
		}	 
		if(result==0)
			System.out.println(1);
		else
			System.out.println(i);
	}
}