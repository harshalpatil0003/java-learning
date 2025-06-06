package Hierarchical;

public class AccountDriver {
public static void main(String[] args) {
	SavingAccount s1=new SavingAccount(50000.0 , 5.5f, "Savings", 1000000.0);
	s1.displaySavingAccount();
	
	BankAccount b1=new BankAccount();
	//b1.displayBankAccount();
	
	
;	LoanAccount l1=new LoanAccount(1500000.0, 10.5f, 20, "Home Loan");	
	l1.displayLoanAccount();
	
	DmatAccount d1=new DmatAccount(20000.0, 7.0f, 120000.0, 12121);
	d1.displayDmatAccount();
}
}
