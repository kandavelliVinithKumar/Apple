package Basics;

import java.util.Scanner;

public class Arthematic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		short num1 = sc.nextShort();
		System.out.println("Enter the second number:");
		short num2 = sc.nextShort();
		System.out.println("The addition is "+(num1+num2));
		boolean temp = sc.hasNextInt();
	}

}
