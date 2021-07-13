

import java.util.*;
public class Zeros
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and col size:");
		int r = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Enter "+r+" X "+c+" Elements:");
		int mat[][] = new int[r][c];
		int row[] = new int[r];
		int col[] = new int[c]; 
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j] = sc.nextInt();
				if(mat[i][j]==0)
				{
					row[i]=1;
					col[j]=1;

				}
			} 
		}
		System.out.println("------------------");
		for(int i=0;i<r;i++)
		{
			if(row[i]==1)
			{
				for(int j=0;j<c;j++)
				{
					mat[i][j]=0;
				}
			}
		}
		for(int j=0;j<c;j++)
		{
			if(col[j]==1)
			{
				for(int i=0;i<r;i++)
				{
					mat[i][j]=0;
				}
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}