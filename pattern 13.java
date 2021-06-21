package Patterns;
public class File1 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) // 5 rows - 1 2 3 4 5 
		{
		for (char j='E'; j >= 'A'; j--) // E D C B A
		{
			System.out.print(j+ " ");			
		}
		System.out.println();
		}
	} }