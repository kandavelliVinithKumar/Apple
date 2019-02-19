package exceptionHandle;

public class ExceptionCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5};
		System.out.println("Start");
		try{
			
			System.out.println(arr[10]);
		}catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		finally {
			System.out.println("Finaly");
			
		}
		System.out.println("End");
	}

}
