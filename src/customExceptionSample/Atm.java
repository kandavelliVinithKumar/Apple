package customExceptionSample;

public class Atm {
	public static boolean isValid(Card card) throws InvalidPinException{
		if(card.pin==1000)
			return true;
		else
			throw new InvalidPinException("Pin not valid");
	}

	public static void main(String[] args) {
		Atm atm=new Atm();
		atm.isValid(1000);
	}
}
