import java.util.*;
public class Perfect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt(); 
		int sum =0;
		for(int i = 1; i <= (n/2); i++)
		{
			if(n%i ==0)
				sum = sum + i;
		}
		if(sum == n)
		System.out.println("Perfect Number");
		else
		System.out.println("Not Perfect Number");
} }