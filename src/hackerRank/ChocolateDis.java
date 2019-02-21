package hackerRank;

public class ChocolateDis {

	public  void distributeCheck(int[] n, int[] m) {
		for (int i = 0; i < m.length; i++) {
			if(m[i]%n[i]==0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateDis cd=new ChocolateDis ();
		int[] m={1,2},n={2,5};
		cd.distributeCheck(m,n);
		
	}

}
