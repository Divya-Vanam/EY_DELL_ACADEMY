package EY_140823;

public class minimumvalue {

	public static void main(String[] args) {
		int intArr[]= {10,20,12,2,16,7,1};
		min(intArr);

	}
	static void min(int[] intArr) {
		int min =intArr[0];
		for(int i=0;i<intArr.length;i++) {
			if(min>intArr[i])
				min=intArr[i];
		}
		System.out.println("Min value is "+min);
	}
	
	
	

}
