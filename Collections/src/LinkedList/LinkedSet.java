package LinkedList;

public class LinkedSet extends LinkedList {

	public LinkedSet() {
		// TODO Auto-generated constructor stub
	}
	public boolean addNode(Object val) {
		if (!contains(val)) {
			return super.addNode(val);
			
		}
		return false;
	}
	
	public boolean addFirst(Object val) {
		if (!contains(val)) {
			return super.addFirst(val);
		}
		return false;
	}
	
	public boolean addLast(Object val) {
		if (!contains(val)) {
			return super.addLast(val);
		}
		return false;
	}
}
