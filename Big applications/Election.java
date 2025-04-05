import java.util.Scanner;
class Election 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int bjp=0,cng=0,aap=0,mns=0,ss=0,nota=0;
		System.out.println("       WelCome    ");
		System.out.print("Enter Population: ");
		int population=sc.nextInt();

		for(int i=1;i<=population;i++)
		{
			System.out.println("*** PARTIES***");
			System.out.println("1.BJP");
			System.out.println("2.CNG");
			System.out.println("3.AAP");
			System.out.println("4.MNS");
			System.out.println("5.SHIV SENA");
			System.out.println("6.NOTA");
			System.out.println("");
			System.out.print("Enter Option: ");
			int opt=sc.nextInt();
			if(opt==1){
				bjp++;
				System.out.println("Modi");
			}
			if(opt==2){
				cng++;
				System.out.println("Gandhi");
			}
			if(opt==3){
				aap++;
				System.out.println("KejriWal");
			}
			if(opt==4){
				mns++;
				System.out.println("Thackrey");
			}
			if(opt==5){
				ss++;
				System.out.println("Shinde");
			}
			if(opt==6){
				nota++;
				System.out.println("No one is liable!");
			}
			if(!(opt>=1&&opt<=6)){
				i--;
				System.out.println("Invalid Option");
			}
		}

		if(bjp>=cng && bjp>=aap && bjp>=mns && bjp>=ss && bjp>=nota){
			System.out.println("BJP won Elections with "+bjp+" votes");
		}
		if(cng>=bjp && cng>=aap && cng>=mns && cng>=ss && cng>=nota){
			System.out.println("CNG won Elections with "+cng+" votes");
		}
		if(aap>=cng && aap>=bjp && aap>=mns && aap>=ss && aap>=nota){
			System.out.println("AAp won Elections with "+aap+" votes");
		}
		if(mns>=cng && mns>=aap && mns>=bjp && mns>=ss && mns>=nota){
			System.out.println("MNS won Elections with "+mns+" votes");
		}
		if(ss>=cng && ss>=aap && ss>=mns && ss>=bjp && ss>=nota){
			System.out.println("Shiv Sena won Elections with "+ss+" votes");
		}

		if(nota>=cng && nota>=aap && nota>=mns && nota>=ss && nota>=bjp){
			System.out.println("Nota gets "+nota+" votes");
		}
	}
}
