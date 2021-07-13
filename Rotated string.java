package Pack1;
import java.util.*;
public class Rotated_String {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 2 strings:");
	String s1 = sc.next();
	String s2 = sc.next();
	// step1
	if (s1.length() != s2.length())
	{
		System.out.println("No");		
	}
	else
	{
		//step2
		String s3 = s1 + s1;	
		//step3
		if(s3.contains(s2))
		{
			System.out.println("Yes");	
		}
		else
		{
			System.out.println("No");	
		}
	}
 }