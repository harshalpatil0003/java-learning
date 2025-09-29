package CollectionsHierarchy.Set;

import java.util.Hashtable;
import java.util.Iterator;
public class HashTable {
	public static void main(String[] args) {
		
		Hashtable<Integer, Object> s= new Hashtable<Integer, Object>();
		
		s.put(1, new Student("Harshal", 01, 90f, 22));
		s.put(2, new Student("Rohit", 02, 90f, 23));
		s.put(3, new Student("Aditya", 03, 91.20f, 22));
		s.put(4, new Student("Chaitanya", 04, 95f, 22));
		s.put(5, new Student("Chaitanya", 04, 95f, 22));
		//Iterator<Student> i= new Iterator<Student>();
		
		System.out.println(s.toString());
		
		
//		Hashtable<Integer, Object> t1= new Hashtable<>();
//		
//		t1.put(2, "Red");
//		t1.put(2, "Green");
//		t1.put(3, "Blue");
//		t1.put(5, "Orange");
//		t1.put(1, "Yellow");
//		t1.put(4,"Violet");
		
		
		//t1.remove(2);    // removes element
		//t1.clear(); //clears table
		//t1.put(6,(Hashtable<Integer, String>) t1.clone()); // can accept collection
		//System.out.println(t1.contains("Yellow")); // returns true or false is element present or not.
		// System.out.println(t1.containsKey(2)); // conatains key true or false.
		
		//System.out.println(t1.toString());
		
		//System.out.println(t1);
	}
}

class Student{
	String name;
	int id;
	float perc;
	int age;
	
public Student() {
	// TODO Auto-generated constructor stub
}

public Student(String name, int id, float perc, int age) {
	super();
	this.name = name;
	this.id = id;
	this.perc = perc;
	this.age = age;
}

	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + ", perc=" + perc + ", age=" + age+"]";
	}

}






















