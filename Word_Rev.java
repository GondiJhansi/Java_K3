
import java.util.*;
public class Word_Rev
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String str = sc.nextLine();
		String words[] = str.split("\\s");
		String rev="";
		for(int i=0;i<words.length;i++)
		{
			if(i==words.length-1)
				rev=words[i]+rev;
			else
				rev=" "+words[i]+rev;
		}
		System.out.println(rev);
	}
}