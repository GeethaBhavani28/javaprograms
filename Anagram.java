public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length())
          return false;
          
        a = a.toLowerCase();
        b = b.toLowerCase();
        int sum =0;
        for(char c ='a'; c <= 'z'; c++)
        {
            for(int i = 0; i< a.length(); i++)
            {
            if(a.charAt(i) == c)
              sum=sum +1;
            if(b.charAt(i) == c)
              sum = sum -1;
            }
            if(sum != 0)
             return false;
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
