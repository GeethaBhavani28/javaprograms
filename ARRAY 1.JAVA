package Arrays;
import java.util.*;
public class Sin_Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int n = sc.nextInt();//5
		int a[] = new int[n];// declare
		System.out.println("enter "+n+" values:");
		for(int i = 0; i<n; i++)
		{
			a[i] = sc.nextInt(); // input 5 values
		}
		System.out.println("index:   even values:");
		for(int i=0; i<n; i++ )
		{
			if(a[i]%2==0)
			System.out.println(i+"\t"+a[i]);
		}	
	} }