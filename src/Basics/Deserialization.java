package Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream file;
		try {
			file = new FileInputStream("D:\\JavaP\\serialize.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			Student s=(Student)in.readObject();
			System.out.println(s.getName()+" "+s.getRoll()+" "+s.getFees());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
