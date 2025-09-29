package CollectionsHierarchy.Set;
import java.util.Collections;
import java.util.HashSet;
public class Hashset {

	public static void main(String[] args) {
		
		HashSet<Bottle> b= new HashSet<Bottle>();
		b.add(new Bottle(1,"red","plastic", 30));
		b.add(new Bottle(2,"yellow","silicon",20));
		b.add(new Bottle(2,"green","plastic",40));
		b.add(new Bottle(4,"silver","steel",250));
		b.add(new Bottle(4,"silver","steel",250));
		b.add(new Bottle(2,"black","steel",100));
		b.add(new Bottle(2,"black","steel",100));
		Collections.sort(b);
		System.out.println(b);
		
//		HashSet<String> s= new HashSet<String>();
//		s.add("harshal");
//		s.add("zeeshan");
//		s.add("Iliana");
//		s.add("Gibral");
//		s.add("Ganesh");
//		s.add("zeeshan");
//		s.add("zeeshan");
//		
//		java.util.Collections.sort(s);
//		System.out.println(s);
	}
	
	
}

class Bottle implements Comparable<Bottle>{
	
	int vol;
	String color;
	String material;
	int price;
	
	
	public Bottle() {
		// TODO Auto-generated constructor stub
	}
	
	public Bottle(int vol, String color, String material,int price) {
		this.vol=vol;
		this.color=color;
		this.material=material;
		this.price=price;
	}
	
	public String toString() {
		return vol+", "+color+", "+material+", "+price;
	}
	
	public int hashCode() {
		return vol+color.hashCode()+material.hashCode()+price;	
	}
	
	public boolean equals(Object o) {
		Bottle b= (Bottle) o;
		return this.vol==b.vol;
	}
	
	@Override
	public int compareTo(Bottle o) {
		return this.color.compareTo(o.color);
	}
	
	
}