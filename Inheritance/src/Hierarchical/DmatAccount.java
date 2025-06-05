package Hierarchical;

public class DmatAccount extends BankAccount {

	double balance;
	float brokerage;
	double holdings;
	long id;
	
	public DmatAccount() {
		// TODO Auto-generated constructor stub
	}

	public DmatAccount(String Name, String BankName, String Ifsc, String Branch, long AccNo,
			 long Phone,double balance,float brokerage,double holdings,long id) {
		this.Name=Name;
		this.BankName=BankName;
		this.Ifsc=Ifsc;
		this.Branch =Branch;
		this.AccNo=AccNo;
		this.Phone=Phone;
		
		this.balance=balance;
		this.brokerage=brokerage;
		this.holdings=holdings;
		this.id=id;
	}
	public void displayDmatAccount() {
		System.out.println("--------DMAT ACCOUNT--------");
		displayBankAccount();
		System.out.println("Balance: "+balance);
		System.out.println("Brokerage: "+brokerage);
		System.out.println("Holdings: "+holdings);
		System.out.println("ID: "+id);
	}
}
