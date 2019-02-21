package hackerRank;

import java.util.Scanner;

public class BrickPro {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of bricks:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {			
			sum=sum+i+i*2;
			if(sum>=n) {
				if(sum-i*2>=n) {
					System.out.println("Patlu");
					break;
				}
				else {
					System.out.println("Motu");
					break;
				}
			}
		}
	}

}
