package hackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SevenArray {

	public static void main(String[] args) {
		SevenArray s= new SevenArray();
		int[] arr1=s.addArrayElements();
		findNewArray(arr1);

	}

	private static void findNewArray(int[] arr1) {
		int[] newArray=new int[arr1.length];
		int n=arr1.length;
		int i = 0,k=0;
		int countSeven=0;
		while(i < newArray.length) {
			if(arr1[i]!=7) {
				newArray[k]=arr1[i];
				
				k++;
			}
			else {
				
				countSeven++;
			}
			i++;
		}
		for (int t = k; t < newArray.length; t++) {
			newArray[t]=7;
		}
		for (int j = 0; j < newArray.length; j++) {
			System.out.println(newArray[j]);
		}
		
		
	}
	

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
		return arr1;
	}

}
