public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here. 
        if(s.trim().length() < 1 || s.trim().length() > 400000)
        {
            System.out.println(0);
          return;   
        }
        
        String words[] = s.trim().split("[ !,?._'@]+");
        
        
        System.out.println(words.length);
        
        for(String w : words)
        {
            System.out.println(w);
        }
        scan.close();
    }
}