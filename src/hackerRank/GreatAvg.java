package hackerRank;

import java.util.Scanner;

public class GreatAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GreatAvg av= new GreatAvg();
		System.out.println("Enter array size");
		int size1=sc.nextInt();
		double arr1[]=new double[size1];
		System.out.println("Enter array values");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextDouble();
		}
		av.findAboveAvg(arr1);

	}

	private static void findAboveAvg(double[] arr1) {
		double total=0,avg;
		for (int i = 0; i < arr1.length; i++) {
			total=total+arr1[i];
		}
		avg=total/arr1.length;
		for (int i = 0; i < arr1.length; i++) {
			if(avg<arr1[i])
				System.out.println(arr1[i]);
		}
	}

}
