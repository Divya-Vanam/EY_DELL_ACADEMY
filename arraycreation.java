package EY_140823;

public class arraycreation {
	public static void main(String[] args) {
	//declaration and instantiation
	int[] intArr = new int[6];
	//initialization
	intArr[0]=10;
	intArr[1]=20;
	intArr[2]=30;
	intArr[3]=40;
	intArr[5]=50;
	intArr[0]=60;
	//DECLARATION,INSTANTIATION AND INITIALIZATION
	String[] strArr= {"z","y","a"};
	//traverse
	for(int i=0;i<=intArr.length-1;i++) {
		System.out.print(intArr[i]+" ");
	}
	System.out.println(" ");
	for(int i=0;i<=strArr.length-1;i++) {
		System.out.print(strArr[i]+" ");
	}
	System.out.println(" ");
	for(int i:intArr) {
		System.out.print(i+" ");
	}
	
	
	}

}
