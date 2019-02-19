package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class SoretedSort {

	private int[] addArrayElements() {
		Scanner sc = new Scanner(System.in);
		GreatAvg av= new GreatAvg();
		System.out.println("Enter array size");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		System.out.println("Enter array values");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		Arrays.sort(arr1);
		return arr1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoretedSort ss = new SoretedSort();
		SoretedSort s2=new SoretedSort();
		int[] arr1=ss.addArrayElements();
		int[] arr2=s2.addArrayElements();
		s2.addArray(arr1,arr2);
		
	}

	private void addArray(int[] arr1,int[] arr2) {
		int totalLen=arr1.length+arr2.length;
		int arr3[]=new int[totalLen];
		int temp=0;
		for (int i = 0; i < arr1.length; i++) {
			arr3[i]=arr1[i];
			temp++;
			System.out.println(arr3[i]);
		}
		for (int j = temp,temp2=0; j < arr3.length&&temp2<arr3.length; j++,temp2++) {
			arr3[j]=arr2[temp2];
			
		}
		Arrays.sort(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

}
