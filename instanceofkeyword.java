package EY_140823;
interface ABC{}

class parent implements ABC{}
class child1 extends parent{}
class child2 extends parent{}
public class instanceofkeyword {

	public static void main(String[] args) {
		parent p = new parent();
		child1 c1 = new child1();
		child2 c2 = new child2();
		System.out.println(p instanceof parent);//true
		System.out.println(p instanceof child1);//false
		System.out.println(p instanceof child2);//f
		
		System.out.println(c1 instanceof parent);//t
		System.out.println(c1 instanceof child1);//t
		
		System.out.println(c2 instanceof parent);//t
		System.out.println(c2 instanceof child2);//t
		
		//System.out.println(c1 instanceof child2);//error
		//System.out.println(c2 instanceof child1);//error
		
		System.out.println(c1 instanceof ABC);
		System.out.println(c2 instanceof ABC);
		System.out.println(p instanceof ABC);
		

	}

}
