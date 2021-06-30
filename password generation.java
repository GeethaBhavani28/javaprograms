package Pack1;
import java.util.*;
public class Pass_Gen {
	
static String password(String name, String num){
	int len = name.length(); // Robert = 6
	while(len != 0)
	{ // num = 36787, 68721
		if(num.contains(len+""))
		{
			char ch[]=name.toCharArray();
			// ch[] = 'R','o','b','e','r','t'
		return ch[len-1]+"";	// t, i
		}
		else
			len=len-1; // 2
	}
	return "X";	// X
	}
	
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	//str = Robert:36787,Tina:68721,Jo:56389
	
	// split str into 3 recs
	String emp[] = str.split(",");// 3 rec
	//emp[0] = Robert:36787
	//emp[1] = Tina:68721
	//emp[2] = Jo:56389	
	
	// 2 empty vars
	String emp_name[],emp_number[];
	emp_name = new String[emp.length];// 3
	emp_number = new String[emp.length];// 3
	
	//each rec split into 2 parts
	for(int i =0; i < emp.length;i++)// 0 1 2
	{  // temp holds only 1 rec
		String temp[] = emp[i].split(":");
		//temp[0] = Tina
		//temp[1] = 68721
		//assign values
		emp_name[i] = temp[0];// 3 names
		emp_number[i] = temp[1]; // 3 empno
	}
	for(int i = 0; i < emp_name.length; i++)
	{
		System.out.print(password(emp_name[i],emp_number[i]));//tiX
	}
} }