package Hierarchical;

public class LoanAccount extends BankAccount {

	double loanAmt;
	float loanInterest;
	int period;
	String loanType;
	
	public LoanAccount() {
		// TODO Auto-generated constructor stub
	}

	public LoanAccount(String Name, String BankName, String Ifsc, String Branch,
			long AccNo, long Phone,double loanAmt,float loanInterest, int period,String loanType ) {
		this.Name=Name;
		this.BankName=BankName;
		this.Ifsc=Ifsc;
		this.Branch =Branch;
		this.AccNo=AccNo;
		this.Phone=Phone;
		
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
