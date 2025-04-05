import java.util.Scanner;
class  VowelsFromUsername
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Username: ");
		String name=new Scanner(System.in).next();
		int len=name.length();
		int count=0;
		for (int i=0;i<=len-1 ;i++ )
		{
			char ch=name.charAt(i);
			if (ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println(name.charAt(i)+" " );
				count++;
			}
		}
		if(count!=0){
			System.out.println(count+" Vowels found ");
		}
		else {=
			System.out.println("NO vowel found");
		}
	}
}
