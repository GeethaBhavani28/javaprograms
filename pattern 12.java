package Patterns;
public class File1 {
	public static void main(String[] args) {
		
		for(char i = 'E'; i>='A';i--) // 5 rows - E D C B A
		{
		for (int j=1; j <=5; j++) // 1 2 3 4 5
		{
			System.out.print(i);			
		}
		System.out.println();
		}
	} }