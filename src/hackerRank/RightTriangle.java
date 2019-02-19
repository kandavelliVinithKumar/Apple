package hackerRank;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sideA,sideB,sideC;
		System.out.println("Enter sides of triangle");
		sideA=sc.nextInt();
		sideB=sc.nextInt();
		sideC=sc.nextInt();
		int squareA=(int) Math.pow(sideA, 2);
		int squareB=(int) Math.pow(sideB, 2);
		int squareC=(int) Math.pow(sideC, 2);
		if(squareA==squareB+squareC||squareB==squareA+squareC||squareC==squareB+squareA)
			System.out.println("Yes");
		else
			System.out.println("NO");
	}

}
