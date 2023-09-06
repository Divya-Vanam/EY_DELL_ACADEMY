package EY2108;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> hSet=new LinkedHashSet<>();
		hSet.add("Z");hSet.add("Z");hSet.add("Z");hSet.add("Z");
		
		hSet.add(null);hSet.add(null);hSet.add(null);
		
		hSet.add("X");hSet.add("A");hSet.add("Y");hSet.add("B");
		
		Iterator<String> itr=hSet.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		

	}

}
