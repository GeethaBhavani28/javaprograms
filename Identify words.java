package Strings;
import java.util.*;
public class No_Words {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String str = sc.nextLine();
		//suresh is for java faculty
		//Aditya Engineering College
		String words[] = str.split(" ");
		//words[0] = suresh ...
		//words[4] = faculty
		System.out.println("No of worfds = "+ words.length);				
	}
}