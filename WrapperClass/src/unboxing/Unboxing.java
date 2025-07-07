package unboxing;

public class Unboxing {

	public static void main(String[] args) {
		//Unboxing 
		// process of converting and storing non-primitive data back to 
		// its respective primitive type.
		
		Byte b=new Byte((byte)127);
		byte b1=b.byteValue() ;
		System.out.println(b);
		
		Short s=new Short((short)32767);
		System.out.println(s.shortValue());
		
		Character c= new Character('H');
		System.out.println(c.charValue());
		
		Integer i=new Integer(100);
		System.out.println(i.intValue());
		
		Long l=new Long(254556546874948865l);
		System.out.println(l.longValue());
		
		Float f=new Float(55.3f);
		System.out.println(f.floatValue());
		
		Double d=new Double(6.671556454564545646);
		System.out.println(d.doubleValue());
		
		Boolean flag =new Boolean(false);
		System.out.println(flag.booleanValue());
		
		
	}
}
