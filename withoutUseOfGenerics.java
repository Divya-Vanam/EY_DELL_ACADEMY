package EY2208;

import java.util.ArrayList;
import java.util.Iterator;

public class withoutUseOfGenerics {

	public static void main(String[] args) {
		ArrayList arrList=new ArrayList();
		arrList.add("ABC");
		arrList.add(123);
		
		String str=(String) arrList.get(0);//type casting
		Integer intData=(Integer)arrList.get(1);
		
		Iterator itr=arrList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}

	}

}
