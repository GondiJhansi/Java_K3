
import java.util.*;
public class Length_No_Space
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence");
		String str = sc.nextLine();
		int n = str.length();
		System.out.println("Length = "+n);
		int m = str.replace(" ","").length();
		System.out.println("Length without spaces = " +m);
	}
}
