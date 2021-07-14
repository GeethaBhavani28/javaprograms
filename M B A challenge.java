package Pack1;
import java.util.*;
public class MBA_Challange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input1:");
		int n = sc.nextInt(); // 3
		System.out.println("Input2:");
		int k = sc.nextInt(); //2
		int s = (int)Math.pow(n, k); // s = 9
		int rem = s%10; // rem = 9%10 = 9
System.out.println(rem);
	} }