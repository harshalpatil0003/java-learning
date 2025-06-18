package NumberPrograms;

public class NumbersImplement extends Numbers {

	public boolean prime(int num) {
		
		int den=2;
		while(num>1) {
			if(num==den)
				return true;
			if(num%den==0)
				return false;
			den++;
		}
		return false;
	}
	
	public int factorial(int num) {
		
		int fact=1;
		while(num!=0)
		{
			fact*=num;
			num--;
		}
		return fact;
	}
	
	public int factor(int num) {
		
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			System.out.print(i+" ");
		}
		return num;
	}
	
	public int squareroot(int num) {
		
		for(int i=1;i<=num;i++) {
			if(i*i==num)
				return i;
		}
		return 0;
	}
	
}
