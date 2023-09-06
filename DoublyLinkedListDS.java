package EY2508;

public class DoublyLinkedListDS {
	class Node{
		int data;
		Node previous;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
		Node head,tail=null;
		public void addItem(int data) {
			Node newNode=new Node(data);
			
			if(head==null) {//means that the list is empty
				head=tail=newNode;
				head.previous=null;
				tail.next=null;
			}else {//list already exists
				tail.next=newNode;
				newNode.previous=tail;
				tail=newNode;
				tail.next=null;
			}
		}
		// will print all the nodes of the list
		public void display() {
			Node current=head;//current element will point to the head
			if(head==null) {
				System.out.println("List is empty");
				return;
			}
			System.out.println("Nodes of doubly linked list: ");
			while(current!=null) {
				System.out.println(current.data+" ");
				current=current.next;
			}
		}
		public static void main(String[] args) {
			DoublyLinkedListDS obj=new DoublyLinkedListDS();
			obj.addItem(1);obj.addItem(2);obj.addItem(3);obj.addItem(4);obj.addItem(10);
			obj.display();
		}
}
