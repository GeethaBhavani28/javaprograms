package Pack1;
import java.util.*;
public class Shift_Elements {
	
	static void shift(int arr[], int n)
	{
		int i ;
	   	int temp = arr[0]; // temp = 1, 2
	   	for( i=0; i<n-1; i++ )// i = 0..6-> 7 elements
	   	{
	   		arr[i] = arr[i+1]; 
	   		// [2,3,4,5,6,7,8]
	   		// [3,4,5,6,7,8,1]
	   	}// i = 7
	   	arr[i] = temp; // [3,4,5,6,7,8,1,2]
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt(); // 8
		System.out.println("Enter value to shift");
		int p = sc.nextInt(); // 2
		int arr[] = new int[n];
		System.out.println("enter "+ n + " elements:");
		for(int i= 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		  
		for(int i =0; i<p; i++) // i = 0..1
			shift(arr,n);
		
		for(int i=0; i<n; i++)
		{
			if(i==(n-1))
				System.out.print(arr[i]);
			else
		  System.out.print(arr[i]+",");
		}

	}

}