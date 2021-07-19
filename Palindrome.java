package Strings;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.next();// malayalam - 9
		String rev="";
		
		for(int i = str.length()-1; i >= 0; i--)
		{ // i =  9-1 = 8
			rev = rev + str.charAt(i);
			// str.charAt(8) - ma
		}
		if(str.equals(rev))// -> t/f
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");		
	}
}