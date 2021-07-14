package Pack1;
import java.util.*;
public class ReplaceGreatestElement_Right {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size:");
		int n = sc.nextInt(); // 8
		int elements[] = new int[n];
		System.out.println("Enter Elements:");
		for(int i =0; i<n; i++)// 8 values
		{  elements[i] = sc.nextInt(); 	}
		
		for(int i =0; i < (n-1); i++)// 0..6
		{ // i = 0 -> first element
			int max =0;
			for(int j=i+1; j < n;  j++)// 1..7
			{ // j = 0+1 = 1 -> second element
				if(elements[j]>max)
					 { max = elements[j]; }
			}// inner loop
			elements[i] = max; // elements[o] = 3
		}// outer loop
		elements[n-1] = -1;
		for(int i=0 ; i<n; i++)
		{
			System.out.print(elements[i]+" ");
		}
	} }