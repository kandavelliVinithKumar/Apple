package inheritance;

public class Child extends Parent {
	
	 String name="Kid";
	
	public void show() {
		System.out.println("This is child class");
	}
	public Child() {
		super();
		System.out.println(name);
		System.out.println(super.name);
		show();
		super.show();
	}
	

	public static void main(String[] args) {
		final int g=5;
		g=10;
		Child child = new Child();
		child.show();
		System.out.println(child.name);

	}

}
