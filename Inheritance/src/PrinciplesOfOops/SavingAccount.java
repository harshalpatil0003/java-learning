package PrinciplesOfOops;

public class SavingAccount extends BankAccount{

	double balance;
	float interest;
	String Acctype;
	
	public SavingAccount() {// default Constructor
		}
	public SavingAccount(String Name,String BankName,String Ifsc,String Branch,long AccNo,long Phone,double balance,float interest,String Acctype) {
		this.Name=Name;
		this.BankName=BankName;
		this.Ifsc=Ifsc;
		this.Branch =Branch;
		this.AccNo=AccNo;
		this.Phone=Phone;
		
		this.balance=balance;
		this.interest=interest;
		this.Acctype=Acctype;
	}
	public void displaySavingAccount() {
		displayBankAccount();
		System.out.println("Balance: "+balance);
		System.out.println("Interest: "+interest);
		System.out.println("Acc Type: "+Acctype);
	}
}