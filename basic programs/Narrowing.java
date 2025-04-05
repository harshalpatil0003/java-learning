class Narrowing 
{
	public static void main(String[] args) 
	{
		{
		double db=400;
		float f=(float)db;
		long l=(long)db;
		int i=(int)db;
		short s=(short)db;
		char ch=(char)db;
		byte b=(byte)db;
	
		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		System.out.println(ch);
		System.out.println(b);
		}

		{
		float f=28.23f;
		long l=(long)f;
		int i=(int)f;
		short s=(short)f;
		char ch=(char)f;
		byte b=(byte)f;
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		System.out.println(ch);
		System.out.println(b);
		}
		
		{
		long l=456;
		int i=(int)l;
		short s=(short)l;
		char ch=(char)l;
		byte b=(byte)l;
		System.out.println(i);s
		System.out.println(s);
		System.out.println(ch);
		System.out.println(b);
		}

		{
		int i=125;
		short s=(short)i;
		char ch=(char)i;
		byte b=(byte)i;
		System.out.println(s);
		System.out.println(ch);
		System.out.println(b);
		}

		{
		short s=30;
		byte b=(byte)s;
		System.out.println(b);
		}

		{
		char ch='H';
		byte b=(byte)ch;
		System.out.println(b);
		}

	}
}
