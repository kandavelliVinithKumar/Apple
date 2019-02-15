package project1;

public class Temp {
	public void dance(int nut) {
		System.out.println(nut);
	}
	String miness(String tempsss) {
		return tempsss;
	}
	public static void main(String[] args) {
		String news="s";
		
		for(int i=0;i<3;i++) {
			news=news+Integer.toString(i);
			System.out.println(news);
			Temp t=new Temp();
			System.out.println(t.miness(news));
			
			
		}
	}

}
