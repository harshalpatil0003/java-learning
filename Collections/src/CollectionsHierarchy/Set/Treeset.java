package CollectionsHierarchy.Set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		System.out.println("Enter sorting option: ");
		 int opt= new Scanner(System.in).nextInt();
		switch (opt) {
		case 1: {
			Comparator<FaceWash> cVol=(o1,o2)->o1.vol>o2.vol?1:o1.vol<o2.vol?-1:0 ;
			TreeSet<FaceWash> f =new TreeSet<FaceWash>(cVol);
			break;
		}
		case 2:{
			Comparator<FaceWash> cPrice=(o1,o2)->o1.price>o2.price?1:o1.price<o2.price?-1:0;
			TreeSet<FaceWash> f =new TreeSet<FaceWash>(cPrice);
			break;
		}
		case 3:{
			Comparator<FaceWash> cColor=(o1,o2)->o1.color.compareTo(o2.color);
			TreeSet<FaceWash> f =new TreeSet<FaceWash>(cColor);
			break;
		} 
		case 4: {
			Comparator<FaceWash> cBrand=(o1,o2)->o1.brand.compareTo(o2.brand);
			TreeSet<FaceWash> f =new TreeSet<FaceWash>(cBrand);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opt);
		}	
		TreeSet<FaceWash> f =new TreeSet<FaceWash>();
		f.add(new FaceWash("Citaphil", 200, 100, "white"));
		f.add(new FaceWash("Natures", 100 ,120, "yellow"));
		f.add(new FaceWash("Garniar", 110, 200, "black"));
		f.add(new FaceWash("Citaphil", 200.0, 100, "white"));
		
		System.out.println(f);
	}
}

class FaceWash{
	 String brand;
	 double price;
	 int vol;
	 String color;
	 
	 public FaceWash() {
		// TODO Auto-generated constructor stub
	}
	 public FaceWash(String brand,double price,int vol, String color) {
			this.brand=brand;
			this.price=price;
			this.vol=vol;
			this.color=color;
		}
	 
	 public String toString() {
		 return "["+brand+", "+price+", "+vol+", "+color+"]";
	 }
	 
	// @Override
//	public int compareTo(FaceWash o) {
//		//return this.brand.compareTo(o.brand);
//		 return (this.vol>o.vol)?1:(this.vol<o.vol?-1:0);
//	}
	

}
