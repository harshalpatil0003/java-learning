package Hierarchical;

public class LoanAccount extends BankAccount {

	double loanAmt;
	float loanInterest;
	int period;
	String loanType;
	
	public LoanAccount() {
		// TODO Auto-generated constructor stub
	}

	public LoanAccount(String Name,String BankName,String Ifsc,String Branch,long AccNo,int pin,long Phone,double loanAmt,float loanInterest, int period,String loanType ) {
		super(Name, BankName, Ifsc, Branch, AccNo, pin, Phone);
		// Constructor binding with super call statement.
		this.loanAmt=loanAmt;
		this.loanInterest=loanInterest;
		this.period=period;
		this.loanType=loanType;
		
	}
	
	public void displayLoanAccount() {
		System.out.println("-----------LOAN ACCOUNT-----------");
		displayBankAccount();
		
		System.out.println("Loan Amt: "+loanAmt);
		System.out.println("Loan Interest: "+loanInterest);
		System.out.println("Period: "+period);
		System.out.println("Loan Type: "+loanType);
	}
	
	
	
}
