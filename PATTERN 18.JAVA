package Patterns;
public class File1 {
	public static void main(String[] args) {
		
		for(int i = 5; i >= 1; i--) // 5 rows - 5 4 3 2 1
		{
		for (int j=i; j <= 5 ;j++) // i times
		{
			System.out.print(j);			
		}
		System.out.println();
		}
	} }