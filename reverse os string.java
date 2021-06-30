package Strings;
import java.util.*;
public class Rev_Str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();// str = "suresh"
		char ch[] = str.toCharArray();
		//toCharArray(): used to convert to char array format
		// ch[] = 's','u','r','e','s','h'
		// ch[0] = 's'
		//ch[5] = 'h'
		String rev =""; // rev is empty
		for( int i = ch.length-1; i >= 0 ; i--)// i = 6-1=5
		{
			rev = rev + ch[i]; // rev = ch[5] = h+s= hs
		}
		System.out.println("reversed string  = "+ rev);
		}
}