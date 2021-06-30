import java.util.*;
public class Even_Fibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:"); 
		long n = sc.nextInt(); // n= 10
		long t1 = 0, t2=1;
		for(int i =1; i<=n; i++)
		{
			long sum = t1+t2;// sum = 1
			if(t1%2==0 && t1 <= n)
				System.out.print(t1+" ");
			if (t1 > n)
				break;
			t1 = t2;
			t2 = sum;
		}		
	}
}