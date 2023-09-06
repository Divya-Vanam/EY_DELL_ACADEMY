package C1708;

public class Trywithresoursewithautoclosable {

	public static void main(String[] args) {
		try {
			trywithresource();
		} catch (Exception e) {
			System.out.println("E thrown" + e.getMessage());
		}
		try {
			trywithoutresource();
		} catch (Exception e) {
			System.out.println("E thrown" + e.getMessage());
		}
		
		
	}
		

	
	static void trywithresource() throws Exception{
		try{Myresource mr=new Myresource()}{
			System.out.println("I am in try with resource method");
			if(true)
				throw new Exception("Exception thrown from try with resource");
		}
	
	static void trywithoutresource() throws Exception{
		Myresource mr=null;
		try{
			mr=new Myresource();
			System.out.println("I am in try WITHOUT resource method");
			if(true)
				throw new Exception("Exception thrown from try WITHOUT resource");
		}finally{
			if(mr!=null) 
			mr.close();
		}
	}
	class Myresource implements AutoCloseable{

		@Override
		public void close() throws Exception {
			System.out.println("CLOSE WILL BE CALLED AUTOMATICALLY"+" FOR ALL CLEANUP ACTIVITY");
			
		}

}
}
