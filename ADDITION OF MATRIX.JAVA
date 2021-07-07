package Arrays;
import java.util.*;
public class Add_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row size:");
		int r = sc.nextInt(); // 3
		System.out.println("enter col size:");
		int c = sc.nextInt(); // 3
		
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		
		int sum[][] = new int[r][c];
		
		System.out.println("enter elements in Matrix-A:");
		for(int i=0;i<r;i++)// row -> 0..2
		{
			for(int j =0; j<c; j++) //col -> 0..2
			{
				a[i][j]= sc.nextInt(); // 9 elements
			}
		}
		
		System.out.println("enter elements in Matrix-B:");
		for(int i=0;i<r;i++)// row -> 0..2
		{
			for(int j =0; j<c; j++) //col -> 0..2
			{
				b[i][j]= sc.nextInt(); // 9 elements
			}
		}
		System.out.println("sum of 2 matices:");
		for(int i=0;i<r;i++)// row -> 0..2
		{
			for(int j =0; j<c; j++) //col -> 0..2
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.printf("%2d ",sum[i][j]);
			}
			System.out.println();
		}
	}}

