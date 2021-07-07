
import java.util.*;
public class Dis_Transpose
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int r = sc.nextInt();
		System.out.println("Enter col size");
		int c = sc.nextInt();
 		int a[][] = new int[r][c];
		System.out.println("Enter "+r+" X "+c+" Values:");
	        for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = sc.nextInt();
			}	
		}
		System.out.println("Matrix Elements are:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");		
			}
			System.out.println();	
		}
		System.out.println("Transpose Elements are:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[j][i]+" ");		
			}
			System.out.println();	
		}

	}

}