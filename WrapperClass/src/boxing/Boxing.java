package boxing;

public class Boxing {

	public static void main(String[] args) {
		
		//Boxing
		//process of converting and storing primitive data to 
		// respective non primitive type.
		
		 byte b=120;
		 Byte b1= new Byte(b);
		 System.out.println(b1);
		 
		 short s=100;
		 Short s1=new Short(s);
		 System.out.println(s1);
		 
		 char c='H';
		 Character c1=new Character(c);
		 System.out.println(c1);
		 
		 int a=10;
		 Integer i1=new Integer(a);
		 System.out.println(i1);
		 
		 long l=1000000000005656550l;
		 Long l1=new Long(l);
		 System.out.println(l1);
		 
		 float f=22.5f;
		 Float f1=new Float(f);
		 System.out.println(f1);
		 
		 double d=45.22552454554545;
		 Double d1=new Double(d);
		 System.out.println(d1);
		 
		 boolean flag=true;
		 Boolean flag1=new Boolean(flag);
		 System.out.println(flag);
		 
	}
}
