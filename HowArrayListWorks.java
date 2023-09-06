package EY2108;

import java.util.ArrayList;
import java.util.Iterator;

public class HowArrayListWorks {

	public static void main(String[] args) {
		//insertion oder is maintained
		ArrayList<String> arrList=new ArrayList<>();//array list object creation
		//duplicates are allowed
		arrList.add("A");arrList.add("A");arrList.add("A");arrList.add("A");
		//any number of null is allowed
		arrList.add(null);arrList.add(null);arrList.add(null);
		arrList.add("Z");arrList.add("X");arrList.add("Y");arrList.add("B");
		
		ArrayList<String> arrList2=new ArrayList<>();
		arrList2.add("P");arrList2.add("P");arrList2.add("Q");
		
		//adding second array list in the first array list
		arrList.addAll(arrList2);
		
		//size of array list
		System.out.println("Size of array list is "+arrList.size());
		
		//removing first A
		arrList.remove("A");
		
		//removing second array List from first array list
		//arrList.removeAll(arrList2);
		
		//updating the element at first index in array list
		arrList.set(1, "New second element");
		//removing all elements from first arrayList and keeping all elements of second array List
		arrList.retainAll(arrList2);
		
		Iterator<String> itr=arrList.iterator();
		while(itr.hasNext()) {
			//hasnext is a boolean type which returns false if there are no iteration to be done
			System.out.print(itr.next()+" ");
		}
		//in the end ,you clear your entire arrayList like this
		arrList.clear();
		
		//you can print your array list like this
		for(String str:arrList) {
			System.out.print("array list is "+str);
		}
	}

}
