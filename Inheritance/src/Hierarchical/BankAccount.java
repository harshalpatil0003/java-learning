package Hierarchical;

public class BankAccount {
	
	String Name="Harshal Patil";
	String BankName="SBI";
	String Ifsc="SBIN000904";
	String Branch="CSN";
	long AccNo=5584854578l;
	int pin;
	long Phone=987654321l;
	
	public BankAccount() {}
//	
//	public BankAccount(String Name,String BankName,String Ifsc,String Branch,long AccNo,int pin,long Phone) {
//		this.Name=Name;
//		this.BankName=BankName;
//		this.Ifsc=Ifsc;
//		this.Branch=Branch;
//		this.AccNo=AccNo;
//		this.pin=pin;
//		this.Phone=Phone;
//	}
	public void displayBankAccount() {
		System.out.println("Name: "+Name);
		System.out.println("Bank: "+BankName);
		System.out.println("IFSC :"+Ifsc);
		System.out.println("Account No: "+AccNo);	
		System.out.println("Phone No: "+Phone);
	}	
}
