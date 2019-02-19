package hackerRank;

import java.util.Scanner;

public class MathPro {

	
	public int getResult(int mat1[][],int row, int col) {
		int left=0,right=0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(i==j) {
					left=left+mat1[i][j];
					
				}
				
			}
			
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if((i+j)==col-1) {
					right=right+mat1[i][j];
					
				}
				
			}
			
		}
		int tempp= Math.abs(left-right);
		return tempp;
	}
	
	
	public static void main(String[] args) {
		int num;
		MathPro m=new MathPro();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and cols");
		int row = sc.nextInt();
		int col=sc.nextInt();
		int mat1[][]=new int[row][col];
		
		if(col==row)
		{
			System.out.println("Enter the elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				num=sc.nextInt();
				mat1[i][j]=num;
			}
			
		}
		
			System.out.println(m.getResult(mat1, row, col));
		}
		else {
			System.out.println("Not possible");
		}

	}

}
