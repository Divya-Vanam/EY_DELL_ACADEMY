package EY2108;

import java.util.Hashtable;
import java.util.Map;

public class HashtableClass {

	public static void main(String[] args) {
		Hashtable<Integer,String> hMap=new Hashtable<>();
		hMap.put(123,"ABC");
		hMap.put(135,"MNO");
		
		hMap.remove(135);
		//THIS IS HOW WE TRAVERSE MAP
		
		for(Map.Entry<Integer, String> m:hMap.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}

	}

}
