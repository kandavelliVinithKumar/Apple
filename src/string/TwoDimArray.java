package string;

import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and cols");
		int row = sc.nextInt();
		int col=sc.nextInt();
		int mat1[][]=new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter the elements");
				num=sc.nextInt();
				mat1[i][j]=num;
			}
			
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat1[i][j]+" ");
				
			}
			System.out.println();
			
		}
	}

}
