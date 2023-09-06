package EY_140823;

public class contin {

	public static void main(String[] args) {
		xyz: for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i==2 && j==2)
					continue xyz;
				System.out.println(i+" "+j);
			}
		}

	}

}
