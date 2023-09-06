package EY_140823;

public class breakloop {

	public static void main(String[] args) {
		xyz :for(int i=1;i<=3;i++) {// xyz is called label
			for(int j=1;j<=3;j++) {
				if(i==2 && j==2)
					break xyz;
				System.out.println(i+" "+j);
			}
		}

	}

}
