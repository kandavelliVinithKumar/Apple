package hackerRank;

import java.util.Scanner;

public class ProfilePic {

	int l,w,h;
	public void checkPicture(/*int l,int w ,int h*/) {
		
		
		if(w<l||h<l) 
			System.out.println("UPLOAD ANOTHER");
		
		else 
			if(w==h) 
				System.out.println("ACCEPTED");
			else 
				System.out.println("CROP IT");
			
		
	}
	public static void main(String[] args) {
		
		ProfilePic pp=new ProfilePic();
		pp.getValues();
		pp.checkPicture(/*pp.l,pp.w,pp.h*/);

	}
	private void getValues() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter L value");
		this.l=sc.nextInt();
		System.out.println("Enter W value");
		this.w=sc.nextInt();
		System.out.println("Enter H value");
		this.h=sc.nextInt();
		
	}

}
