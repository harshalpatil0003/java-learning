package student;

public class StudentDB {
public static void main(String[] args) {
	
	Student[] stud= new Student[5];
	
	stud[0]= new Student("Harshal", "SVIT", 22, 25, 2556534264l);
	stud[1]= new Student("Jay", "JSPM", 23, 35, 2154541525l);
	stud[2]= new Student("Anuj", "RSVP", 22, 36, 4563225896l);
	stud[3]= new Student("Gaurav", "KKW", 21, 26, 2654153698l);
	stud[4]= new Student("Om", "SKH", 28, 37, 4569871235l);
	
	for (int i = 0; i < stud.length; i++) {
		System.out.println(stud[i].coll);
	}
}
}
