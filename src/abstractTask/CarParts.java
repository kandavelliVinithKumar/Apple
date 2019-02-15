package abstractTask;

public abstract class CarParts {
	public CarParts() {
		wheels();
	}
	abstract void wheels();
	abstract void steering();
	abstract void door();
	public void seats() {
		System.out.println("The seats are installed.");
	}
}
