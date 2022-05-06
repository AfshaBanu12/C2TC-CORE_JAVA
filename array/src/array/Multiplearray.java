package array;

import java.util.Scanner;
public class Multiplearray{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the nof rows");
		int row = s1.nextInt();
		System.out.println("enter the nof columns");
		int col = s1.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter" + row*col + "elements to the matrix");
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				a[i][j]=s1.nextInt();
			}
		}
		for(int i=0;i<row; i++)
		{
			for (int j=0; j<col; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		

	}

}