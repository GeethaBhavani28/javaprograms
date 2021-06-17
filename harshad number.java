package Numbers;
import java.util.*;
public class Harshad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt(); // 18
		int sum =0;
		int temp = n ; // c =18
		// sum of digits
		while(n > 0)
		{
			int rem = n%10;
			sum = sum + rem; // 9
			n = n/10;
		}
		if (temp%sum == 0 )
			System.out.println("Harshad Number");
		else
			System.out.println("Not Harshad Number");
} }