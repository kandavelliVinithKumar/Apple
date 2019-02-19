package hackerRank;

public class OrangeApple {

	static void countApplesandOranges(int s,int t,int a,int b,int app[],int ora[]) {
		int apples=app.length;
		int oranges=ora.length;
		int appleCount=0,orangeCount=0;
		for (int i = 0; i < apples; i++) {
			if(((app[i]+a)>=s)&&(app[i]+a)<=t) {
				appleCount++;
			}
		}
		for (int i = 0; i < oranges; i++) {
			if(((ora[i]+b)<=t)&&(ora[i]+b)>=s) {
				orangeCount++;
			}
		}
		System.out.println(appleCount+" "+orangeCount);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrangeApple oa= new OrangeApple();
		int a[]= {10,-5,15,7,18};
		int b[]= {10,-17,15,-7,-15};
		oa.countApplesandOranges(10, 20, 5, 30, a,b);
	}

}
