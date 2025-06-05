package Hierarchical;

public class SavingAccount extends BankAccount{
	double balance;
	float interest;
	String Acctype;
	double translimit;
	
	public SavingAccount() {// default Constructor
		}
	public SavingAccount(String Name,String BankName,String Ifsc,String Branch,long AccNo,long Phone,double balance,float interest,String Acctype,double translimit) {
		this.Name=Name;
		this.BankName=BankName;
		this.Ifsc=Ifsc;
		this.Branch =Branch;
		this.AccNo=AccNo;
		this.Phone=Phone;
		
		this.balance=balance;
		this.interest=interest;
		this.Acctype=Acctype;
		this.translimit=translimit;
	}
	public void displaySavingAccount() {
		System.out.println("---------SAVINGS ACCOUNT--------");
		displayBankAccount();
		System.out.println("Balance: "+balance);
		System.out.println("Interest: "+interest);
		System.out.println("Acc Type: "+Acctype);
		System.out.println("Transaction Limit: "+translimit);
	}
}
