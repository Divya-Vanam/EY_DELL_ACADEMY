package EY2108;


import java.util.HashSet;
import java.util.Iterator;

public class HashSetWithBookClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book> hSet=new HashSet<>();
		
		Book b1=new Book(1,"A","B","C",10);
		Book b2=new Book(32,"P","Q","R",100);
		Book b3=new Book(21,"M","N","O",1800);
		hSet.add(b3);hSet.add(b3);hSet.add(b2);
		hSet.add(b2);hSet.add(b1);hSet.add(b1);
		Iterator<Book> itr=hSet.iterator();
		while(itr.hasNext()) {
			Book b=itr.next();
			System.out.println(b.bookId+" "+b.name+" "+b.publisher+" "+b.author+" "+b.qunatity);
		}

	}

}
