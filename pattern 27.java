package Patterns;
public class File1 {
	public static void main(String[] args) {		
		for(int i = 1; i <= 5; i++) // 5 rows - 1 2 3 4 5
		{
		for (int j=5; j >= i ;j--) // i times
		{
			System.out.print(i+" ");
		}
		System.out.println();
		}
	} }