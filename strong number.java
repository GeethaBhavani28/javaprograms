package Numbers;
import java.util.*;
public class Strong {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = obj.nextInt(); // 145
		int fact, rem, sum =0, temp = n;
		// identify each digit
		while(n != 0)  // n = 145, 14, 1
		{
			fact =1;
			rem = n%10;  // rem = 5,4,1
			int i=1;
			// each digit factorial
			while(i <= rem) // 
			{
				fact = fact * i; // 120, 24 ,1
				i++;
			}// end while
			sum = sum + fact; // 0+120 + 24+ 1 = 145
			n = n/10; // n = 14, 1,0 
		}// end while
		if (sum == temp)
			System.out.println(temp+" is Strong number");
		else
			System.out.println(temp+" is Not Strong number");
} }