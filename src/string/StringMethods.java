package string;

public class StringMethods {

	public static void main(String[] args) {
		String s=" Hey buddy, how are you doing today ";
		System.out.println(s.charAt(6));
		//System.out.println(s.charAt(61));
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim());
		System.out.println(s.startsWith(" Hey"));//Add even the space
		System.out.println(s.endsWith("day "));//Add even the space
		System.out.println(s.endsWith("da"));
		System.out.println(s.endsWith(" "));
		String s2=s.replace("o", "O");
		System.out.println(s2);
	}

}
