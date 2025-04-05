import java.util.Scanner;
class  Bank
{
	public static void main(String[] args) 
	{
		String username1=null;
		String password1=null;
		String name=null;
		String address=null;
		double balance=0.0;
		long contact=0;
		Scanner sc=new Scanner(System.in);
		for (; ; )
		{
		System.out.println(" ---------WELCOME--------");
		System.out.println("       *** Patil's Bank ***     \n \n ");
		System.out.println("Choose Option: ");
		System.out.println("1. Login");
		System.out.println("2. Create account ");
		int opt=sc.nextInt();
		if (opt==1)
		{
			if(username1==null){
				System.out.println("Create your account first ");
				continue;
			}
				for (int i=3;i>=1 ;i-- )
				{
					System.out.print("Enter Username: ");
					String username=sc.next();
					System.out.print("Enter Password: ");
					String password=sc.next();
				
				
				if (username.equals(username1) && password.equals(password1))
				{
					home:
					for (; ; )
					{
					System.out.println("    HOME PAGE    \n");
					System.out.println("1. Deposit");
					System.out.println("2. Withdraw");
					System.out.println("3. Check balance");
					System.out.println("4. Mini Statement");
					System.out.println("5. Logout \n");
					System.out.print("Enter an option: ");
					int opt1=sc.nextInt();

					switch (opt1)
					{
					case 1:{
						System.out.println("Deposit");
						System.out.print("Enter amount: ");
						double deposit=sc.nextDouble();
						 balance+=deposit;
						System.out.println("Account is credited with Rs: "+deposit +"\n");
						break;

					}
					case 2:{
						System.out.println("Withdraw");
						System.out.print("Enter amount to withdraw: ");
						double debit=sc.nextDouble();
						for (int k=3; k>=1;k-- )
						{
						System.out.print("Enter PIN: ");
						String pin=sc.next();
						if (pin.equals(password1))
						{
							if(balance>=debit){
								balance-=debit;
								System.out.println("Account is debited with Rs: "+debit +"\n");
								continue home;
							}
						}
						else{
								System.out.println("Invalid PIN");
								System.out.println("Attempts left "+(k-1));

							}
						}
					//	System.exit(0);
						break;
					}
					case 3:{
						System.out.println("Check Balance");
						for (int j=3; j>=1;j-- )
						{
							System.out.print("Enter PIN: ");
							String pin=sc.next();
							if (pin.equals(password1))
							{
									System.out.println("Account balance is Rs: "+balance+"\n");
									continue home;
							}
							else{
									System.out.println("Invalid PIN");
									System.out.println("Attempts left "+(j-1));

								}	
							}
								System.out.println("Too many attempts try after 24 hrs.\n");
						
						 break;
					 }
					case 4:{
						 System.out.println("Mini Statement");
						 break;
					}
					case 5:{
							System.out.println("Thank you for using this application \n");
							System.exit(0);
							break;
					}
					}
				}
				}
				else {
					System.out.print("Invalid Credentials \n");	
		}	
		}

		}
		else if (opt==2)
		
		{		System.out.print("Enter name: ");
				name=sc.next();
				System.out.print("Enter Address: ");
				address=sc.next();
				sc.nextLine();
				System.out.print("Enter Username: ");
				username1=sc.next();
				System.out.print("Enter Password: ");
				password1=sc.next();
				System.out.print("Enter Contact no: ");
				contact=sc.nextLong();
				System.out.print("Enter Amount: ");
				balance=sc.nextDouble();
				System.out.println("Account created successfully!! \n");
		}
		else{
			System.out.println("Choose valid option");
		}
		}
	}
}
