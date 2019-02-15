package conditional;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2=sc.nextInt();
		System.out.println("Enter 3rd number: ");
		int num3=sc.nextInt();
		if(num1==num2&&num2==num3) {
			System.out.println("All are equal.");
		}
		else if(num1>num2) {
			if(num1>num3) {
				System.out.println("Greatest number is:"+num1);
			}
			else {
				System.out.println("Greatest number is:"+num3);
			}
		}
		else {
			if(num2>num3) {
			System.out.println("Greatest number is:"+num2);
			}
		}

	}

}
