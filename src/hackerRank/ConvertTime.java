package hackerRank;

public class ConvertTime {
	static String timeConversion(String s) {
		String returnString;
		String strSplit[]= s.split(":");
		int arr1[]=new int[3];
		char aOrp=strSplit[2].charAt(2);
		if(aOrp=='A') {
			strSplit[2]=strSplit[2].split("A")[0];
		
			for (int j = 0; j < strSplit.length; j++) {
				arr1[j]=Integer.parseInt(strSplit[j]);
			
			}
			if(arr1[0]==12&&arr1[1]==0&&arr1[2]==0) {
				returnString="00:00:00";
			}
			else {
				returnString=Integer.toString(arr1[0])+":"+Integer.toString(arr1[1])+":"+Integer.toString(arr1[2]);
			
		}
			
		}
		else {
			strSplit[2]=strSplit[2].split("P")[0];
			
			for (int j = 0; j < strSplit.length; j++) {
				arr1[j]=Integer.parseInt(strSplit[j]);
			
			}
			if(arr1[0]==12&&arr1[1]==0&&arr1[2]==0) {
				returnString="12:00:00";
			}
			else {
				returnString=Integer.toString(arr1[0]+12)+":"+Integer.toString(arr1[1])+":"+Integer.toString(arr1[2]);
			
		}
			
		}
		return returnString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(timeConversion("07:50:55PM"));
	}

}
