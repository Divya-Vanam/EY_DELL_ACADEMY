package EY_140823;

import java.util.Objects;

class Employee{
	String firstname;
	public String getFirstNamw() {
		return firstname;
	}
	public void setFirstName(String firstname) {
		this.firstname=firstname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(firstname);
	}
	//source and generate hashcode and equals option
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstname, other.firstname);
	}
	
}
public class Letstestequalswithdefinedclass {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.setFirstName("abc");
		e2.setFirstName("abc");
		if(e1.equals(e2)) {
			System.out.println("Equals works with custom class");
		}else {
			System.out.println("Equals does not work with custom class");
		}
		//hashcode and equals doesnt work for custom classes if they are ot generated (ie source and generate hashcode and equals)
		System.out.println("Memory address is "+e1.hashCode());
		System.out.println("Memory address is "+e2.hashCode());

	}

}
