package C1708;
/*
 * OVERLOADING::
 * @OVERLOADING AND OVER RIDING IS PART OF POLYMORPHISM 
 * @POLYMORPHISM MEANS ONE WORK/FUNCTIONALITY CAN BE DEFINED IN MANY WAYS
 * @2 TYPES---COMPILE TIME(METHOD OVERLOADING)
 *        ---RUNTIME TIME(METHOD OVERRIDING)
 * @OVERLOADING  ALWAYS HAPPENES ON THE BASES OF PARAMETER LIST AND 
 * NEVER HAPPENS ON THE BASES OF RETURN TYPE
 * @OVERLOADING- SAME METHOD, DIFFERENT PARAMETERS
 * @OVERRIDING- IT IS BASICALLY INHERITANCE
 * @RUNTIME POLYMORPHISM(METHOD OVERRIDING)
 */
public class AdderUtility {
       int add(int a,int b) {
    	   return a+b;
       }
      double add(double a,double b) {
    	   return a+b;
       }
      int add(int a,int b,int c) {
   	   return a+b+c;
      }
	public static void main(String[] args) {
		AdderUtility obj=new AdderUtility();
		System.out.println("Result is "+obj.add(100,200));
		System.out.println("Result is "+obj.add(100.22,200.22));
		System.out.println("Result is "+obj.add(100,200,300));



	}

}
