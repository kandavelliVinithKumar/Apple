package interfaces;

public class Mobile implements MobileFeatures,Mother{
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.toPlay();
	}

	@Override
	public void toOpen() {
		// TODO Auto-generated method stub
		System.out.println("Mobile is unlocked");
	}

	@Override
	public void toPlay() {
		// TODO Auto-generated method stub
		System.out.println("Game opened");
	}

	@Override
	public void toExit() {
		// TODO Auto-generated method stub
		System.out.println("Mobile is locked");
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Mother name");
	}
}
