package PrinciplesOfoOops;

public class BankAccount {
	private String name;
	private String bankname;
	private long contact;
	private long accno;
	private int pin;
	private String ifsc;
	private double balance;
	
	BankAccount(String name,String bankname,long contact,long accno,int pin,String ifsc)
	{
		this.name=name;
		this.bankname=bankname;
		this.contact=contact;
		this.accno=accno;
		this.pin=pin;
		this.ifsc=ifsc;
	}
	
	public String getName()
	{
		return name;
	}
	public String getbankname() {
		return bankname;
	}
	public long getcontact() {
		return contact;
	}
	public long getaccountNo() {
		return accno;
	}
	public String getifsc() {
		return ifsc;
	}
	public double getbalance(long accno , int pin) {
		return balance;
	}
	public void setPin(long accno,int oldpin,int newpin) {
		if(this.accno==accno && this.pin==oldpin) {
			this.pin=newpin;
			System.out.println("Pin Updated");
		}
		else {
			System.out.println("Invalid credentials!");
		}
	}
	public void credit(long accno,int pin, double amt){
		if(this.accno==accno && this.pin==pin) {
			if(amt>0) {
				balance+=amt;
				System.out.println("Amount is credited");
				System.out.println("Your Acc Balance is rs "+balance);
			}
			else {
				System.out.println("Invalid amount");
			}
		}
		else {
			System.out.println("Invalid credentils");
		}
		
	}
	public void debit(long accno,int pin,double amt) {
		if(this.accno==accno && this.pin==pin) {
			if(this.balance>=1000) {
				if(amt>0) {
					balance-=amt;
					System.out.println("Amount is debited");
					System.out.println("Your Acc Balance is rs "+balance);
				}
				else {
					System.out.println("Invalid amount");
				}
				
			}
			else {
				System.out.println("Insufficient balance");
			}
			
		}
		else {
			System.out.println("Invalid credentials");
		}
	}
	
	
}
