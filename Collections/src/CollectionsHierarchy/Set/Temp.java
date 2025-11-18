package CollectionsHierarchy.Set;

public class Temp {

	private static void main(String[] args) {
		
		Integer i1 = 30;
		Integer i2 = 30;
		
		Integer i3 = 130;
		Integer i4 = 130;
		System.out.println(i1.hashCode()+"   "+i2.hashCode());
		System.out.println(i1==i2);
		System.out.println(i3==i4);
		System.out.println(i1.equals(i2));
		System.out.println(i3.equals(i4));
		
	}
}
