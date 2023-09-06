package EY2108;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListWithBookClass {
 
	public static void main(String[] args) {
		LinkedList<Book> list=new LinkedList<>();
		Book b1=new Book(1,"A","B","C",10);
		Book b2=new Book(32,"P","Q","R",100);
		Book b3=new Book(21,"M","N","O",1800);
		
	    list.add(b1);list.add(b2);list.add(b3);
		list.add(b1);list.add(b2);list.add(b1);
		
		ListIterator<Book> listItr=list.listIterator();
		while(listItr.hasNext()) {
			Book b=listItr.next();
			System.out.println(b.bookId+" "+b.name+" "+b.publisher+" "+b.author+" "+b.qunatity);
		}
		System.out.println();
		while(listItr.hasPrevious()) {
			Book b=listItr.previous();
			System.out.println(b.bookId+" "+b.name+" "+b.publisher+" "+b.author+" "+b.qunatity);
		}  
		
	}
}
