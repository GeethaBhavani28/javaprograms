package Pack1;
import java.util.*;
public class Largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number and Digit");
		int number = sc.nextInt(); // 145
		int digit = sc.nextInt(); // 4
		// convert digit to char
		
		char c = Integer.toString(digit).charAt(0); // c = 4
		int i;
		//largest number less than  given number
		for(i = number-1; i > 0 ; i--) // i = 145,144,143,..139
		{
			//if 'i' does not contain 'c'
			if(Integer.toString(i).indexOf(c)== -1)
			{
				System.out.println(i);// 139 
				break;
			}
		}
		if (i==0)
			System.out.println("-1");
	}

}