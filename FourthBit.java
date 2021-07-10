

public class FourthBit
{
	public static void main(String[] args)
	{
		int num=23;
		int c=0;
		while(num!=0)
		{
			int r=num%2;
			num=num/10;
			c=c++;
			if(c==4)
				System.out.println(r);

		}

	}

}