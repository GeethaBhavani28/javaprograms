package Strings;
import java.util.*;
public class Rev_each_word {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String str = sc.nextLine();
		String words[] = str.split("\\s");
		//words[0] = suresh ...
		//words[4] = faculty
		String rev ="";// sentence
		// to pick each word
		for(int i =0; i<words.length; i++) // i = 0 < words.length=5 => 0 1 2 3 4
		{
			String w = words[i]; // w = is - 2
			String r = "";  // each word
			// to reverse each word
			for(int j =  w.length()-1; j>= 0; j-- )// j = 1 0 -> t
			{
				r = r + w.charAt(j); // r = si				
			}
			//System.out.println(r);
			rev = rev+r+" "; // hserus si rof avaj ytlucaf
		}
		System.out.println(rev);
} }