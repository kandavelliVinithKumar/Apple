package abstractTask;

public class Car extends CarParts{

	public Car() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarParts c = new Car();
		c.seats();
	}

	@Override
	void wheels() {
		// TODO Auto-generated method stub
		System.out.println("Wheels are fixed.");
	}

	@Override
	void steering() {
		// TODO Auto-generated method stub
		System.out.println("Steering is installed");
	}

	@Override
	void door() {
		// TODO Auto-generated method stub
		System.out.println("Doors ");
	}

}
