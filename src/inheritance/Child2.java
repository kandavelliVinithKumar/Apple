package inheritance;

public class Child2 extends Parent{
	
	public String name="Grand Son";
	
	public static void main(String[] args) {
		
		Child2 c = new Child2();
		c.show();
		System.out.println(c.name);

	}

}
