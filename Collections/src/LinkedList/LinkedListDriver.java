package LinkedList;

public class LinkedListDriver {

	public static void main(String[] args) {
		LinkedList l1= new LinkedList();	
	
		l1.addNode(200);
		l1.addNode(300);
		l1.addNode(400);
		l1.addNode(500);
		l1.addNode(600);
	
		LinkedList l2= new LinkedList();
		
		//Node head=l1.iterator();
		//l1.removeNode(200);
		//l1.removeNode(400);
		
		
		l2.addNode(500);
		l2.addNode(500);
		l2.addNode(500);	
		l2.addNode(500);
		l2.addNode(500);
		
	//	l1.addAll(l2);
		//l1.removeAll(l2);
		//System.out.println(l1.containsAll(l2));
	   // l2.removeFirt();
		//l2.removeLast();
		System.out.println(l2);
		
		System.out.println(l1);
		//System.out.println(l1.reatainAll(l2));
		//System.out.println(l1.contains(600));
		
		
		
		//System.out.println(l1.getsize());
	}
}
