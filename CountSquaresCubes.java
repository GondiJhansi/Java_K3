
import java.util.*;
public class CountSquaresCubes
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		int square=0,square_count=0;
		int cube=0,cube_count=0;
		for(int i=1;i<=num;i++)
		{
			square=i*i;
			if(square<num)
			{
				square_count++;
			}
			cube=i*i*i;
			if(cube<num)
			{
				cube_count++;
			}


		}
		System.out.println("No of Squares = " +square_count);
		System.out.println("No of Cubes = " +cube_count);
	}
}