package Patterns;
public class File1 {
	public static void main(String[] args) {
		int x =1;
		for(int i = 1; i<=5;i++) // 5 rows - 1,2,3,4,5
		{
		for (int j =5; j>=1; j--) // 5 4 3 2 1
		{
			System.out.print(x+" ");
			x = x+2;
		}
		System.out.println();
		}
	} }