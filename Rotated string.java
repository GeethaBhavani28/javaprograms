package Pack1;
import java.util.*;
public class File1 {
	public static void main(String[] args) {
		int n , e_sum =0, o_sum =0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Array size:");
		n = obj.nextInt(); // 5
		int a[] = new int[n];
		
		//input 5 values
		for(int i =0; i< n; i++)
		{
			a[i] = obj.nextInt(); // 1 2 3 4 5
		}
		for(int i=0; i < n; i++)
		{
			if(a[i]%2==0 && i%2==0)
				e_sum = e_sum+a[i];
			else if(a[i]%2==1 && i%2 ==1)
				o_sum = o_sum + a[i];
		}
		System.out.println(e_sum+ " "+o_sum);	
	}
}