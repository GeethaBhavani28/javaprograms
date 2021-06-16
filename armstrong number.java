package Numbers;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {			
		int d=0;
		int sum =0;
		for(int n =0 ; n <= 1000; n++)
		{
			int t = n; // 
		// no of digits
		while(n > 0)
		{
			int rem = n%10;
			d++; // d = 3
			n= n/10;
		} // end of while loop
		n = t; 
		// check Armstrong
		while(n>0)
		{
			int rem = n%10; // rem = 153%10 = 3,5,1
			sum = sum + (int)Math.pow(rem, d);
			n = n/10;
		}	// end of while loop
		// verify Armstrong
		if(t == sum )
		  {	System.out.println(t); }
		
		d = 0;
		sum = 0;
		n = t;
		}// end of for loop
} }