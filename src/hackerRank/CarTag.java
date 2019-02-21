package hackerRank;

public class CarTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkTag("13M484-22");
	}

	private static void checkTag(String str) {
		// TODO Auto-generated method stub
		
		int[] num=new int[7];
		int temp=0,check = 0;
		char[] vowels= {'A','E','I','O','U','Y'};
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {				
				num[temp]=str.charAt(i);
				temp++;
			}
		}
		for (int i = 0; i < vowels.length; i++) {
			if(vowels[i]!=str.charAt(2)) {
				check=1;
			}
		}
		for (int i = 0; i < num.length-1; i++) 			
			if(i!=1&&i!=4) 				
				if((num[i]+num[i+1])%2==0) 					
					check++;
				
		if(check==5) 
			System.out.println("Valid");
		
		else 
			System.out.println("Not valid");
		
	}

}
