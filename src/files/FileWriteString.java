package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			FileOutputStream fileOutputStream;
			try {
				fileOutputStream = new FileOutputStream("D:\\JavaP\\demo.txt");
				System.out.println("Enter name");
				String n =sc.next();
				byte[] b =n.getBytes();
				fileOutputStream.write(b);;
				fileOutputStream.close();
				System.out.println("Done");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		
	}

}
