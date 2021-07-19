package Strings;
import java.util.Scanner;
public class No_Chars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String str = sc.nextLine();
		//suresh is for java faculty
		String words[] = str.split(" ");
		//words[0] = suresh ...
		//words[4] = faculty
		
		// to pick each word
		for(int i =0; i<words.length; i++)
			// i = 0 < words.length=5 => 0 1 2 3 4
		{
			String w = words[i]; 
			// w = suresh-6 , is -2		
			
			System.out.println(w +" = "+ w.length());            
		}
}}