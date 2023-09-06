package EY2208;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UnboundedWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnboundedWildCard obj=new UnboundedWildCard();
		List<String> liststr=new ArrayList<>();
		liststr.add("ABC");
		liststr.add("XYZ");
		obj.printCollectionData(liststr);
		
		List<Integer> listInt=new ArrayList<>();
		listInt.add(123);
		listInt.add(456);
		obj.printCollectionData(listInt);
	}
	void printCollectionData(Collection<?> objToPrint) {//collection is a class and a framework
		System.out.println("[");
		for(Object obj:objToPrint) {
			System.out.println(obj.getClass().getCanonicalName()+":"+obj);
		}
		System.out.println("]");
		System.out.println();
	}

}
