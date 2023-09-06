package EY_140823;

public class Empcode {
	int empId;
	String empName;
	double empSalary;
	String empDesignation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empcode emp= new Empcode();
		/*emp.setEmpId(123);
		emp.setEmpName("ABC");
		emp.setEmpSalary(10000);
		emp.setEmpDesignation("Tech Consulting");*/
		
		System.out.println("ID of the employee is "+emp.getEmpId());
		System.out.println("Name of the employee is "+emp.getEmpName());
		System.out.println("Salary of the employee is "+emp.getEmpSalary());
		System.out.println("Designation of the employee is "+emp.getEmpDesignation());
	}
	
}
