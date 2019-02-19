package hackerRank;

public class ExceptionPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {1,2,3};
		int p[]= {1,-2,3};
		ExceptionPro ep= new ExceptionPro();
		try {
			ep.power(b,p);
		}catch(Exception e) {
			
		}
	}

	public static void power(int[] b, int[] p) throws ItsNegativeException,ItsZeroException {
		// TODO Auto-generated method stub
		double result=0;
		for (int i = 0; i < p.length; i++) {
		if(b[i]>0&&p[i]>0) {
			result=b[i]^p[i];
			System.out.println(Math.pow(b[i], p[i]));		
		}
		else if(b[i]<0||p[i]<0) {
			throw new ItsNegativeException();
		}
		else {
			throw new ItsZeroException();
		}
	}
		

}
}

class ItsNegativeException extends Exception {
	ItsNegativeException(){
	System.out.println("n or p should not be negative");
}
}
class ItsZeroException extends Exception {
	ItsZeroException(){
	System.out.println("n and p should not be zero");
}
}
