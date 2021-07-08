
import java.util.*;
public class Addition_Matrix
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int r = sc.nextInt();
		System.out.println("Enter col size");
		int c = sc.nextInt();
 		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		int s[][] = new int[r][c];
		System.out.println("Enter elements of  matrix a");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter elements of  matrix b");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j] = sc.nextInt();
				
			}
			System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				s[i][j] = a[i][j]+b[i][j];
				
			}
		}
		
		System.out.println("Addition Matrix is:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.printf("%2d ",s[i][j]);
				
			}
			System.out.println();
		
		}	
	}
}