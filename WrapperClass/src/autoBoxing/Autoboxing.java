package autoBoxing;

public class Autoboxing {
public static void main(String[] args) {
	
	Integer a1= 100;  //autoboxing
	System.out.println(a1);
	int a=a1;  	      // auto-unboxing
	System.out.println(a);
	
	Float f1=65.63f;  //autoboxing
	float f=f1;       //auto-unboxing
	System.out.println(f);
	
	Character c1='P';  //autoboxing
	char c=c1;		   //auto-unboxing
	System.out.println(c);
	
	Boolean flag=true;  //autoboxing
	boolean flag1=flag;  //auto-unboxing
	System.out.println(flag1);
	
}
}
