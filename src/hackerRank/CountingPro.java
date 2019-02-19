package hackerRank;

import java.util.Scanner;



public class CountingPro {

	static void plusMinus(double[] arr) {
		double minus=0,plus=0,zeros=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0)
				minus++;
			else if(arr[i]>0)
				plus++;
			else
				zeros++;
			
			
		}
		int lenArr=arr.length;
		
		System.out.println(plus/lenArr);
		System.out.println(minus/lenArr);
		System.out.println(zeros/lenArr);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size fo array:");
		int num = sc.nextInt();
		double arr1[]= new double[num];
		System.out.println("Enter array values");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextDouble();
		}
		CountingPro c = new CountingPro();
		c.plusMinus(arr1);
	}

}
