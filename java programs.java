package Numbers;
import java.util.*;
public class Min_Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 43856
		int rem=0,  max=0 ;
		int min = 9;
		while(n != 0) // n = 43853
		{
			rem = n%10; // rem = 4
			if(rem > max ) // 4 > 8 -> f
				max = rem; // max = 8
			if (rem < min) // 4 < 3
				min = rem; // min =3 
			n = n/10; // n= 4385
		}
		System.out.println("maximum digit = "+max);
		System.out.println("minimum digit = "+min);
	}
}