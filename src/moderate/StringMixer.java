package moderate;

import java.util.Scanner;

public class StringMixer {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=getStringsFromUser();
		String s2=getStringsFromUser();
		alternateConcatinate(s1, s2);
	}

	private static  String getStringsFromUser() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s1=sc.next();
		return s1;
	}

	private static void alternateConcatinate(String s1,String s2) {
		StringBuilder strb = new StringBuilder();
		
		char[] s1arr= s1.toCharArray();
		char[] s2arr= s2.toCharArray();
		int len;
		int temp=0,temp1=0;
		if(s1.length()==s2.length()) {
			len=s1.length();
		}
		else {
			len=s1.length()-s2.length();
		}
		for (int i = 0; i < len; i++) {
			strb.append(s1.charAt(i));
			strb.append(s2.charAt(i))
			
		}
		System.out.println(strb);
	}

}
