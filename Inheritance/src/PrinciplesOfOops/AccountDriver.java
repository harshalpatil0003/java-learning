package PrinciplesOfOops;

public class AccountDriver {
public static void main(String[] args) {
	SavingAccount a1=new SavingAccount();
	
	BankAccount b1=new BankAccount();
	b1.displayBankAccount();
	
	System.out.println("---------------------------------");
	
	SavingAccount a2=new SavingAccount("Harshal","SBI","SBIN0000904","Csn",987654321l,8767889865l,50000.0,3.5f,"Saving");
	a2.displaySavingAccount();
}
}