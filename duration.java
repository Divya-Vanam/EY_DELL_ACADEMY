package EY_140823;

public class duration {
	long startvalue,endvalue;
	duration(long startvalue,long endvalue){
		if(startvalue>endvalue) {
			throw new IllegalArgumentException("Start time can never be greater than end time");
	
		}
		this.startvalue=startvalue;
		this.endvalue=endvalue;
	}
	long Duration() {
		return endvalue-startvalue;
	}
	public static void main(String[] args) {
		duration obj= new duration(19,21);
		System.out.println("Duration is "+obj.Duration());
		

	}

}
