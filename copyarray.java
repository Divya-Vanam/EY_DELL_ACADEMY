package EY_140823;

import java.util.Arrays;

public class copyarray {

	public static void main(String[] args) {
		char[] chArr1= {'z','a','r','q','b','t'};
		char[] ch2= new char[3];
		System.arraycopy(chArr1, 2, ch2, 0, 3);
		System.out.println(Arrays.toString(ch2));
		System.out.println(new String(ch2));
		

	}

}
