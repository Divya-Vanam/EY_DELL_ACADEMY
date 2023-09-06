package EY_140823;

public class EmployeeData {
	//non static
	int empId;
	String empName;
	
	static String orgAddress="ABC XYZ";
	//allows sharing of data.. less memory consumption
	static void  orgAddressChange() {
		orgAddress="MNO PQR";
	}
	EmployeeData(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
				
	}
	void display() {
		System.out.println("Id of emp is "+empId+" and name is "+empName+" organisation address is "+orgAddress);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData.orgAddressChange();// static method calling
		EmployeeData e1=new EmployeeData(123,"John");
		EmployeeData e2=new EmployeeData(124,"Johnny");
		e1.display();
		e2.display();
		
	}

}
