package moderate;
import java.util.Scanner;

import Basics.Student;

public class ObjectPassingDemo {
	Scanner sc =new Scanner(System.in);
	Student s =new Student();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		ObjectPassingDemo ob =new ObjectPassingDemo();
		s1=ob.accept();
		ob.display(s1);

	}
	private  void display(Student s) {
		// TODO Auto-generated method stub
		System.out.println(s.getName());
		System.out.println(s.getRoll());
		System.out.println(s.getFees());
	}
	private Student accept() {
		// TODO Auto-generated method stub
		System.out.println("Enter name");
		s.setName(sc.next());
		System.out.println("Enter roll");
		s.setRoll(sc.nextInt());
		System.out.println("Enter fee");
		s.setFees(sc.nextInt());
		return s;
	}

}
