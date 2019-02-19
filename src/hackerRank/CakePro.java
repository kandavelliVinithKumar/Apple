package hackerRank;

import java.util.Arrays;


public class CakePro {

	static int birthdayCakeCandles(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		int countCandles=0;
		for (int i = 0; i < arr.length; i++) {
			if(max==arr[i])
				countCandles++;
		}
		return countCandles;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CakePro c = new CakePro();
		int arr1[]= {4,4,3,2,1};
		System.out.println(c.birthdayCakeCandles(arr1));
	}

}
