
import java.util.*;
public class Rev_Each_Word 
{
	public static void main(String[] rags)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String str= sc.nextLine();
		String words[]=str.split("\\s");
		String rev="";
		for(int i=0;i<words.length;i++)
		{
			String w=words[i];
			String r="";
			for(int j=w.length()-1;j>=0;j--)
			{
				r=r+w.charAt(j);

			}
			rev=rev + r +" " ;
		}
		System.out.println(rev);
	}
} 