import java.util.*;
public class NCR {
static int fact(int n)
{
	int fact =1;
	for( int i = 2; i<=n; i++)
	{
		 fact = fact *i;
	}
	return fact;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input1:");
		int n = sc.nextInt();
		System.out.println("input2:");
		int r = sc.nextInt();
		System.out.println("input3:");
		double m = sc.nextDouble();
		int ncr= (int)(fact(n) / (fact(r) * fact(n-r))%m);
		System.out.println(ncr);
	}
}