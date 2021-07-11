public class Closed_Paths {
	public static void main(String[] args) {
    int number = 1288;
    int n = number; // n = 1288
    int c = 0;
    while(n != 0)
    {
    	int r = n%10; // r =8
    	n= n/10; // n = 128
    	if( r==0 || r==4 || r==6 || r==9)
    		c = c+1;
    	else if (r == 8)
    		c = c+2;    	
    }
    System.out.println(c); // return c;
}}