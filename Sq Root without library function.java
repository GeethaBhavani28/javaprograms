package Pack1;
import java.util.*;
public class Sqrt_without_function {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter number");
int n = sc.nextInt(); // 16
float sqrt , t=0;
//sqrt half of given number
sqrt = n/2; // 16/2 = 8
//perform the iterations
if (n == 1)
	System.out.println("Square root of "+n+" is "+n);
else
{
while(sqrt != t) // 4.0 != 4.0 
{
	t = sqrt;// t =  4.0
	sqrt = (n/t + t)/2;
	//sqrt = 16/8 = 2 + 8 = 10/2 = 5
	//sqrt = 16/5 = 3.1 + 5 = 8.1/2 = 4.1
	// sqrt = 16/4.1 = 3.9 + 4.1 = 8/2 = 4.0
	// sqrt = 16/4.0 = 4.0 + 4.0 = 8/2 = 4.0
}
System.out.println("Square root of "+n+" is "+sqrt);
    }
  }
}