
import java.util.*;
public class No_Chars
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence");
		String str = sc.nextLine();
		String words[] = str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String w = words[i];
			System.out.println(w+" = " +w.length());


		}








	}








}