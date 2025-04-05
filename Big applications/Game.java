import java.util.Scanner;
class Game 
{
	public static void main(String[] args) 
	{
		int rNum=0;
		for(;;){
		int num=(int)(Math.random()*10);//generates double value from 0.00 to 1
		if(num>=1 && num<=3){
			rNum=num;
			break;
		}
		}
		String botOpt=null;
		if(rNum==1){
			botOpt="STONE";
		}
		else if(rNum==2){
			botOpt="PAPER";
		}
		else if(rNum==3){
			botOpt="SCISSORS";

		}
		else{
			System.out.println("Invalid Input");
			return;
		}
		System.out.println(" ");
		System.out.println("  *** WELCOME ***  ");
		System.out.println(" ");
		System.out.println("1. STONE");
		System.out.println("2. PAPER");
		System.out.println("3. SCISSORS");
		System.out.println(" ");

		System.out.print("Choose Option: ");
		int opt=new Scanner(System.in).nextInt();

		String userOpt=null;
		if(opt==1){
			userOpt="STONE";
		}
		else if(opt==2){
			userOpt="PAPER";
		}
		else if(opt==3){
			userOpt="SCISSORS";
		}
		else{
			System.out.println("Invalid Option");
			return;
		}

		System.out.println("User: "+userOpt+"   "+"Bot: "+botOpt);

		if((opt==1&&rNum==3) || (opt==2 && rNum==1)||(opt==3 && rNum==2)){
			System.out.println("User Wins");
		}
		else if((opt==1&&rNum==2) || (opt==2 && rNum==3)||(opt==3 && rNum==1)){
			System.out.println("Bot Wins");
		}
		else{
			System.out.println("Draw");
		}
		
	}
}
