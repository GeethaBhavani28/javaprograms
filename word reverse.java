package Strings;
import java.util.*;
public class Word_Rev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String str = sc.nextLine();		
		String words[] = str.split("\\s");
		//words[0] = suresh...
		//words[4] = java
		String rev="";
		// words.length = 5
		for(int i = 0; i< words.length; i++)// 0,1,2,3,4
		{
			//if(i == words.length-1)// 4 == 4
				//rev = words[i] + rev; // java
			//else // 0,1,2,3
				rev = " " + words[i] + rev;    
			//rev =  is suresh			
		}	
		System.out.println(rev);
	}
}