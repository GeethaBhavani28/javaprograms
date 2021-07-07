package Arrays;
import java.util.*;
public class Mul_Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row size:");
		int r = sc.nextInt();
		System.out.println("enter col size:");
		int c = sc.nextInt();
		
		int a[][] = new int[r][c];
		
		System.out.println("enter "+r+" X "+c+" values");
		for(int i=0; i<r; i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix Elements:");
		for(int i=0; i<r; i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Tranpose Elements:");
		for(int i=0; i<c; i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	} }
