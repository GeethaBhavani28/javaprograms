package Numbers;
import java.util.*;
public class Disarium {
	static int count(int n) // n =135
	{
		int rem = 0;		
		while(n !=0) // n= 135, 13,1
		{						 
		 rem = rem+1; // rem = 3 
		 n = n/10;  // 1/10 = 0
		}
		return rem;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt(); // 135
		
		int len = count(num); // len = 3
		int n= num; // n= 135
        int sum =0;
        
        //sum of its digits powered with their position
        while(num>0) // num = 13, 1
        {
          int rem = num%10; // rem = 1
          sum = sum + (int)Math.pow(rem, len); 
          // sum = 0 + pow(5,3) = 125 + pow(3,2) = 134
          // sum = 134+ pow(1,1) = 135
          num = num/10; // num = 1/10 = 1
          len--;  // len = 1         
        }
        if(sum == n)
        	System.out.println(n+" is disarium number");
        else
        	System.out.println(n+" is Not disarium number");
	}
}