package LinkedList;

public class Node{
	
	Object val;
	Node prevRef;
	Node nextRef;
	Node currRef;
 	
	private Node() {
		// TODO Auto-generated constructor stub
	}
	public Node(Object o) {
		val= o;
		currRef=this;
	}
	public Node next() {
		return nextRef;
	}
	public Node prev() {
		return prevRef;
	}
	public boolean hasnext() {
		return nextRef!=null;
	}
	public boolean hasprev() {
		return prevRef!=null;
	}

	
}