package ClassObjs;

public class Bank {
	int accNo=99;
	int balance=3876;
	Bank(){
		System.out.println("Constructor called");
	}
	
	public Bank(int accNo, int balance) {
		this();
		int temp1=this.accNo;
		int temp2=this.balance;
		this.accNo=accNo;
		this.balance=balance;
		System.out.println(temp1+" "+temp2);
		System.out.println(accNo+" "+balance);
		System.out.println(accNo);
		new Bank();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Bank b1 = new Bank();
		Bank b2 = new Bank(20,40);
		new Bank();
	}

}
