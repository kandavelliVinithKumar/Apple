package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutpus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("D:\\JavaP\\demo.txt");
			System.out.println("Enter Integer");
			int n =sc.nextInt();
			fileOutputStream.write(n);
			fileOutputStream.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
