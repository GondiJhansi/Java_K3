
import java.util.*;
public class Max_Len
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence");
		String str = sc.nextLine();
		int n = str.length();
		int res=0,curr_len=0;
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)!=' ')
				curr_len++;
			else
			{
				res=Math.max(res,curr_len);
				curr_len=0;
			}

		}
		System.out.println(Math.max(res,curr_len));
			
	}
}