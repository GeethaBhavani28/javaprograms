import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        String words = s.substring(0,k); // words = wel
        
        smallest = words; // wel
        largest = words; // wel
        
        for(int i = 1; i <= (s.length())-k; i++ )
        {
            words = s.substring(i,(i+k)); // elc
            if(words.compareTo(smallest) < 0 ) // elc < wel -> t
            smallest = words; // smallest = ava
            if(words.compareTo(largest) > 0 )// elc > wel -> f
            largest = words; // largest = wel
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}