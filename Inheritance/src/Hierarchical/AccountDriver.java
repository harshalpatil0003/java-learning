package Hierarchical;

public class AccountDriver {
public static void main(String[] args) {
	//SavingAccount s1=new SavingAccount("Harshal", "SBI", "SBIN000904", "CSN", 5584854578l, 987654321l,50000.0 , 5.5f, "Savings", 1000000.0);
	//s1.displaySavingAccount();
	
	BankAccount b1=new BankAccount();
	b1.displayBankAccount();
;	LoanAccount l1=new LoanAccount("Harshal", "SBI", "SBIN000904", "CSN", 5584854578l, 987654321l, 1500000.0, 10.5f, 20, "Home Loan");	
	l1.displayLoanAccount();
	
	DmatAccount d1=new DmatAccount("Harshal", "SBI", "SBIN000904", "CSN", 5584854578l, 987654321l,20000.0, 7.0f, 120000.0, 12121);
	d1.displayDmatAccount();
}
}
