package Patterns;
public class File2 {
	public static void main(String[] args) {
		int x=1;
		for(int i = 1; i <= 5; i++) // 5 rows -> 1 2 3 4 5 
		{
			for( int j = 5; j > i; j--) // 4 3 2 1 0 spaces
			{
				System.out.print(" ");
			}
			for(int n=1; n <= x;n++) // 1 3 5 7 9 times
			{
				System.out.print((char)(x+64));				
			}
			x = x+2; // x= 3,5,7,9
			System.out.println();
		}
} }