package Arrays;
public class Mul_Ex1 {
	public static void main(String[] args) {
		int a[][] = { {10,20}, {30,40} };
		for(int i=0; i<2; i++)// row = 0,1
		{
			for(int j=0; j<2;j++)// cols -0,1
			{
				System.out.print(a[i][j]+"\t");// 10 20
			}
			System.out.println();// nextline
		}		
	} }