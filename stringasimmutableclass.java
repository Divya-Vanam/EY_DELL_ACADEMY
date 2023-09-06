package EY_140823;

public class stringasimmutableclass {

	public static void main(String[] args) {
		String str= new String("ABC");
		System.out.println("1-Value is "+str);
		str.concat("XYZ");
		System.out.println("2-Value is "+str);
		
		//jdk 1.1 synchronised thread safe
		StringBuffer sb=new StringBuffer("ABC");
		System.out.println("3-Value is "+sb.toString());
		sb.append("MNO");
		System.out.println("4-Value is "+sb.toString());
		
		//jdk 1.5 fast
		StringBuilder sb2=new StringBuilder("PQR");
		System.out.println("5-Value is "+sb2.toString());
		sb2.append("STU");
		System.out.println("6-Value is "+sb2.toString());
			

	}

}
