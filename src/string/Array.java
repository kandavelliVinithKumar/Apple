package string;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int accNo[] = new int[5];
		accNo[2]=345;
		accNo[4]=452;
		System.out.println(accNo);
		for (int i = 0; i < accNo.length; i++) {
			System.out.println(accNo[i]);
		}
	}

}
