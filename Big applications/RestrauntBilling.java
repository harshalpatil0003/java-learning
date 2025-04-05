import java.util.*;
class RestrauntBilling
{
	static String name;
	static long contact;
	static String address;
	static ArrayList<String> basket=new ArrayList<>();
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		/*for (; ; )
		{
			System.out.println("🍵🍵🍵🍵 Harshal's Restraunt 🍵🍵🍵🍵\n");
			System.out.println("1. Create Account");
			System.out.println("2. Existing User");
			System.out.print("Choose option: ");
			int opt=sc.nextInt();
			switch (opt)
			{
			case 1: createAccount(sc);break;
			case 2: login(sc);break;
			default:System.out.println("Choose correct option \n");break;
			}
		}

	}
	public static void createAccount(Scanner sc)
	{
		System.out.println("Create Account \n");
		System.out.print("Username: ");
		name=sc.next();
		System.out.print("Contact: ");
		contact=sc.nextLong();
		System.out.print("Address: ");
		address=sc.nextLine();
		sc.nextLine();
		System.out.println("Account created successfully");

	}
	public static void login(Scanner sc)
	{
		if (name==null)
		{
			System.out.println("Crete account first \n");
			return;
		}
		System.out.println("Login \n");
		for (int attempts=3;attempts>=1;attempts--)
		{
			System.out.print("Username: ");
			String username=sc.next();
			System.out.print("Password: ");
			long password=sc.nextLong();
			if (name.equals(username) && contact==password)
			{
				home(sc);
			}
			else{
				System.out.println("Invalid credentials");
				System.out.println("Attempts left "+(attempts-1));
			}
		}
			System.out.println("Thank you never visit again");
			System.exit(0);

	*/
		home(sc);
	}
	public static void home(Scanner sc)
	{
		for (; ; )
		{
			System.out.println("   WEL COME  ");
			System.out.println("1. Menu");
			System.out.println("2. Orders");
			System.out.println("3. Table Booking");
			System.out.println("4. Logout \n");
			System.out.print("Choose option: ");
			int opt=sc.nextInt();
			switch (opt)
			{
			case 1:menu(sc);break;
			case 2:orders(sc);break;
			case 3:tableBooking(sc);break;
			case 4:System.out.println("Thank you visit again");
				System.exit(0);break;
			default:System.out.println("choose correct option");break;
		}
		}
	}
	public static void menu(Scanner sc)
	{
		for (; ; )
		{
			System.out.println("😋😋😋  MENU  😋😋😋");
			System.out.println("1 : Sandwich 60/-");
			System.out.println("2 : Pizza 150/-");
			System.out.println("3 : Burger 80/-");
			System.out.println("4 : Fries 50/-");
			System.out.println("5 : Waffles 120/-");
			System.out.println("6 : ----Exit menu----");
			System.out.print("Choose foodId: ");
			int opt=sc.nextInt();
			switch (opt)
			{
			case 1:{
				basket.add("1 : Sandwich 60");
				System.out.println("Sandwich is added to basket");break;
				}
			case 2:{
				basket.add("2 : Pizza 150");
				System.out.println("Pizza is added to basket");break;
			}
			case 3:{
				basket.add("3 : Burger 80");
				System.out.println("Burger is added to basket");break;
			}
			case 4:{
			basket.add("4 : Fries 50");
			System.out.println("Fries is added to basket");break;
			}
			case 5:{
				basket.add("5 : Waffles 120");
				System.out.println("Waffles is added to basket");break;
			}
			case 6:return;
			
			default:System.out.println("Choose correct foodid");break;
		}
		}

	}
	public static void orders(Scanner sc)
	{
		System.out.println("  ORDERS  \n");
		if (basket.size()==0)
		{
			System.out.println("Empty Basket! Add food items");
			return;
		}
		for (String foodItem: basket)
		{
			System.out.println(foodItem);
		}
					System.out.println();
			System.out.println("1. Cancel Order ❌");
			System.out.println("2. Remove food item 🗑️");
			System.out.println("3. Proceed to payment 💵");
			System.out.print("Enter the option: ");
			int opt=sc.nextInt();
			switch (opt)
			{
			case 1:{
				System.out.println("Order Cancelled");
				basket.clear();break;
				}
			case 2:{
				System.out.print("Enter foodId: ");
				int foodId=sc.nextInt();
				removeFoodItem(foodId);
				break;
				}
			case 3:{
				billGeneration();
				break;
				}
			}
	}
	public static void tableBooking(Scanner sc)
	{
		System.out.println("Book Table");
	}
	public static void removeFoodItem(int foodId)
	{
		ArrayList<String> dupbasket=new ArrayList<>(basket);
		int index=0;
		boolean flag=false;
		for (String foodItem:dupbasket )
		{
			String [] arr=foodItem.split(" ");
			if(arr[0].equals(foodId+""))
			{
				dupbasket.remove(index);
				flag=true;
				System.out.println("Food item removed");
			}
			index++;
		}
		if (!flag)
			System.out.println("Food item does exist in basket");
		basket=dupbasket;
	}
	public static void billGeneration()
	{
		double totalBill=0;
		for (String foodItem:basket)
		{
			String [] arr=foodItem.split(" ");
			totalBill+=Double.parseDouble(arr[3]);
		}
		System.out.println("Total Bill: "+totalBill+"rs.");
	}
}
