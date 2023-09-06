package EY2108;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		
		list.add("A");list.add("A");list.add("A");list.add("A");
		
		list.add(null);list.add(null);list.add(null);
		
		list.add("Z");list.add("Y");list.add("X");list.add("B");
		
		list.addFirst("First element");
		list.addLast("Last element");
		
		Object firstElement=list.getFirst();
		System.out.println("First element is "+firstElement);
		Object lastElement=list.getLast();
		System.out.println("Last element is "+lastElement);
		
		int position=list.indexOf("Z");
		System.out.println("position is "+position);
		
		int lastPosition=list.lastIndexOf("A");
		System.out.println("Position of last A is "+lastPosition);
		
		list.add(0,"Added element at 0th index");
		list.remove(2);//removed element from second index
		
		list.removeFirst();
		list.removeLast();
		list.removeFirstOccurrence("A");
		list.removeLastOccurrence("A");
		
		
		Object o=list.poll();// returns and remove first item from the list
		Object o2=list.pollLast();//returns and removes last element from the list
		/*
		 * this is basically used for array lists
		 *
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			//hasnext is a boolean type which returns false if there are no iteration to be done
			System.out.print(itr.next()+" ");
		}
		*/
		ListIterator<String> listItr=list.listIterator();
		while(listItr.hasNext()) {
			System.out.print(listItr.next()+" ");
		}
		System.out.println();
		while(listItr.hasPrevious()) {
			System.out.print(listItr.previous()+" ");
		}  
	}

}
