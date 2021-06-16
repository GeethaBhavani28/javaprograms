package Numbers;
import java.util.*;
public class Pronic {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number:");
int num = sc.nextInt(); // 20
int x =0;
for(int i=0; i< num; i++)
{
	if(i*(i+1)==num)
	{
		x=1;
		break;
	}
}
if (x==1)
	System.out.println("Pronic Number");
else
	System.out.println("Not Pronic Number");
}}