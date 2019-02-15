package string;

import java.util.Scanner;

public class BankKotak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long accNo,aadharNo,balance,phoneNo;
		Scanner sc = new Scanner(System.in);
		long[] kotak[]=new long[4][];
		long customerDetails[][]=new long[4][4];
		for (int i = 0; i < 4; i++) {
			System.out.println("Enter customer "+(i+1)+" details:");
			
				System.out.println("Enter the account number:");
				accNo=sc.nextLong();
				customerDetails[i][0]=accNo;
				System.out.println("Enter the Aadhar number:");
				aadharNo=sc.nextLong();
				customerDetails[i][1]=aadharNo;
				System.out.println("Enter the balance:");
				balance=sc.nextLong();
				customerDetails[i][2]=balance;
				System.out.println("Enter the contact number:");
				phoneNo=sc.nextLong();
				customerDetails[i][3]=phoneNo;
		}
		
		for (int i = 0; i < 4; i++) {
			
			kotak[i]=customerDetails[i];
			
			
		}
			
		for (int i = 0; i < kotak.length; i++) {
			for (int j = 0; j < kotak.length; j++)
				System.out.print(kotak[i][j]+" ");
			System.out.println();;
		}
	}

}
