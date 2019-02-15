package conditional;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num1=sc.nextInt();
		if(num1%2==0) {
			num1+=10;
		}
		else {
			num1+=15;
		}
		System.out.println("Now the result is "+num1);
	}

}
