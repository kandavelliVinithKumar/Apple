package string;

import java.util.Scanner;

public class ArrayDynamic {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		int accNo[] = new int[5];
		System.out.println(accNo);
		for (int i = 0; i < accNo.length; i++) {
			System.out.println("Enter the number");
			num=sc.nextInt();
			accNo[i]=num;
		}
		for (int i = 0; i < accNo.length; i++) {
			System.out.println(accNo[i]);
		}
}
}
