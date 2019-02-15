package loops;

import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1=sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(num1+"*"+i+"="+(num1*i));
			i++;
		}
	}
}
