package PrinciplesOfoOops;

public class BankDriver {
public static void main(String[] args) {
	BankAccount b1=new BankAccount("Raju","mahabank",8767854525l,12345166,1234,"MAHB000904");
	System.out.println(b1.getName());
	System.out.println(b1.getbankname());
	System.out.println(b1.getaccountNo());
	System.out.println(b1.getcontact());
	System.out.println(b1.getifsc());
	
	b1.debit(12345166, 1234, 1000);
	b1.credit(12345166, 1234, 10000);
	b1.setPin(12345166, 1234, 4256);
	System.out.println(b1.getbalance(12345166,4256));
	b1.debit(12345166, 4256,1000);	
}
}
