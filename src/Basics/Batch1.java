package Basics;

public class Batch1 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setFees(5000.21);
		s1.setName("Vin");
		s1.setRoll(582);
		System.out.println(s1);
		System.out.println(s1.getFees());
		System.out.println(s1.getName());
		System.out.println(s1.getRoll());
		
		Student s2 = new Student();
		s2.setFees(10000);
		s2.setName("Sha");
		s2.setRoll(581);
		System.out.println(s2.getFees());
		System.out.println(s2.getName());
		System.out.println(s2.getRoll());
	}

}
