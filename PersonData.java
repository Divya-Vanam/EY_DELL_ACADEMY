package EY_140823;

public class PersonData implements Cloneable{
	int personid;
	String personname;
	PersonData(int personid,String personname){
		this.personid=personid;
		this.personname=personname;
	}
	

	public static void main(String[] args) throws CloneNotSupportedException {
		PersonData obj1=new PersonData(123,"abc");
		PersonData obj2=  (PersonData) obj1.clone();
		System.out.println(obj1.personid+obj1.personname);
		System.out.println(obj2.personid+obj2.personname);

	}

}
