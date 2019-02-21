package Basics;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student= new Student();
		student.setName("Vinith");
		student.setRoll(582);
		student.setFees(35000);
		
		FileOutputStream file;
		try {
			file = new FileOutputStream("D:\\JavaP\\serialize.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(student);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
