package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {

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
	public int[] twoNum(int arr1[]){
		
		int j=0,k=0,evenSize=0,arrLength=arr1.length;
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]%2==0) {
				evenSize++;
			}
			
		}
		int[] even = new int[evenSize];
		int[] odd = new int[arrLength-evenSize];
		for (int i = 0; i < arrLength; i++) {
			if(arr1[i]%2==0) {
				even[j]=arr1[i];
				j++;
			}
			else {
				odd[k]=arr1[i];
				k++;
			}
		}
		Arrays.sort(even);
		Arrays.sort(odd);
		int[] result=new int[arr1.length];
		for (int i = 0; i < evenSize; i++) {
			
				result[i]=even[i];
				
		}
		for(int i = 0; i < arrLength-evenSize; i++) {
			result[evenSize+i]=odd[i];
			
		}
			
		
		return result;
	}
	public static void main(String[] args) {
		EvenOdd eo=new EvenOdd();
		int[] arr1=eo.twoNum(eo.addArrayElements());
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}

}
