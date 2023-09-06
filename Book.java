package EY2108;

public class Book implements Comparable<Book>{
	int bookId;
	String author,publisher,name;
	int qunatity;
	
	//constructor
	Book(int bookId,String author,String publisher,String name,int qunatity)
	{
		this.bookId=bookId;
		this.author=author;
		this.publisher=publisher;
		this.name=name;
		this.qunatity=qunatity;
	}
	@Override
	public int compareTo(Book o) {
		if(bookId>o.bookId) {
		return 1;
		}else if(bookId<o.bookId){
		return -1;
		}else {
			return 0;
		}
	}}
	


