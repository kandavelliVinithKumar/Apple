package hackerRank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CaesarCipher {

	public static void encryption(){
		int key = 0;
		
		StringBuilder msg=new StringBuilder();
		try {
			FileInputStream fis1 = new FileInputStream("D:\\JavaP\\message.txt");
			FileInputStream fis2 = new FileInputStream("D:\\JavaP\\key.txt");
			int i;
			while((i=fis1.read())!=-1) {
			msg.append((char) (i));
			}
			
			fis1.close();
			
			key=fis2.read();
			fis2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msgStr=msg.toString();
		char[] letters=msgStr.toCharArray();
		StringBuilder encmsg=new StringBuilder();
		for (int i = 0; i < letters.length; i++) {
			encmsg.append((char)(byte)(letters[i]+key));
		}
		System.out.println("Encrypted msg: "+encmsg);
		
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("D:\\JavaP\\encrypted.txt");
			
			String n =encmsg.toString();
			byte[] b =n.getBytes();
			fileOutputStream.write(b);;
			fileOutputStream.close();
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void decryp(){
		StringBuilder enmsg=new StringBuilder();
		int key=0;
		try {
			FileInputStream fis1 = new FileInputStream("D:\\JavaP\\encrypted.txt");
			FileInputStream fis2 = new FileInputStream("D:\\JavaP\\key.txt");
			int i;
			while((i=fis1.read())!=-1) {
			enmsg.append((char) (i));
			}
			
			fis1.close();
			
			key=fis2.read();
			fis2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String msg=enmsg.toString();
		char[] let=msg.toCharArray();
		StringBuilder decmsg=new StringBuilder();
		for (int i = 0; i < let.length; i++) {
			decmsg.append((char)(byte)(let[i]-key));
		}
		System.out.println("de "+decmsg);

	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc =new Scanner(System.in);
			FileOutputStream fos1;
			try {
				fos1 = new FileOutputStream("D:\\JavaP\\message.txt");
				System.out.println("Enter Message:");
				String n =sc.next();
				byte[] b =n.getBytes();
				fos1.write(b);
				fos1.close();
				
				FileOutputStream fos2 = new FileOutputStream("D:\\JavaP\\key.txt");
				System.out.println("Enter key:");
				int key =sc.nextInt();
				fos2.write(key);
				fos2.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			encryption();
			decryp();
		}

}
