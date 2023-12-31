package EY2108;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	//hashSet gives unique elements in random order
	public static void main(String[] args) {
		
		HashSet<String> hSet=new HashSet<>();
		hSet.add("Z");hSet.add("Z");hSet.add("Z");hSet.add("Z");
		
		hSet.add(null);hSet.add(null);hSet.add(null);
		
		hSet.add("X");hSet.add("A");hSet.add("Y");hSet.add("B");
		
		Iterator<String> itr=hSet.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
