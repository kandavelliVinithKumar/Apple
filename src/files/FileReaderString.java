package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis;
		try {
			fis = new FileInputStream("D:\\JavaP\\demo.txt");
			int i;
			while((i=fis.read())!=-1) {
			System.out.print((char)i);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
