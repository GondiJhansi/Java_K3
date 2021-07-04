
import java.util.*;
public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		int t1 = 0;
		int t2 = 1;
		System.out.print(t1+" "+t2);
		int sum = 0;
		for(int i=3;i<=num;i++)
		{
			sum = t1 + t2;
			System.out.print(" "+sum);
			t1 = t2;
			t2 = sum;
		}

	}

}