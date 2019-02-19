package exceptionHandle;

import java.util.Scanner;
import java.util.Arrays;
public class SmallLargeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		System.out.println("Enter array values");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter kth index");
		int k=sc.nextInt();
		if(k<arr1.length) {
		smallK(arr1,k);
		largeK(arr1,k);
		}
		else
			System.out.println("Invaid k");
	}

	private static void largeK(int[] arr1, int k) {
		// TODO Auto-generated method stub
		Arrays.sort(arr1);
		
		System.out.println(arr1[(arr1.length)-k]);
	}

	private static void smallK(int[] arr1, int k) {
		Arrays.sort(arr1);
		System.out.println(arr1[k-1]);
	}

}
