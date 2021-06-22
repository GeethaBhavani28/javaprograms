package Patterns;
public class File1 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) // 5 rows - 5 4 3 2 1
		{
		for (int j=1; j <= i ;j++) // i times
		{
			System.out.print(j*2+" ");			
		}
		System.out.println();
		}
	} }