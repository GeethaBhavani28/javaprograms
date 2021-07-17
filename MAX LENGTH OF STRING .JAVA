package Strings;
import java.util.*;
public class Max_len {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence");
		String str = sc.nextLine();
		int n = str.length(); 
		int res = 0, curr_len=0;
		for(int i = 0; i<n; i++)
		{
			if(str.charAt(i) != ' ')
				curr_len++; // 4
			else
			{
				res = Math.max(res, curr_len);// res = 7
				curr_len = 0;
			}				
		}
System.out.println(Math.max(res, curr_len));
	} }
