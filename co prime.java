package Pack1;
import java.util.*;
public class Co_Primes {
// check for prime numbers
	static boolean prime(int inputNumber)
	{
		boolean flag = true;
		if(inputNumber <= 1)
		{
			flag = false;
			return flag;
		}
		else
		{
			for(int i = 2; i <= inputNumber/2; i++)
			{
				if( (inputNumber%i )==0)
				{
					flag = false;
					break;
				}
			}
		return flag;
		}	
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int s = sc.nextInt(); // 10
		int e = sc.nextInt(); // 100
		
		int first , second;
		int found =0;
		
		for(int i = s; i+2 <= e; i++)// i = 99, 101<= 100->f
		{
			first = i; // 10, 11
			second = i+2; // 12, 13
			
			if( prime(first) && prime(second))
			{
				System.out.println("("+first+", "+second+")");
				found = 1;
			}			
		}
		if(found == 0)
		  System.out.println("-1");
		}
	}