package commitrollback;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class CommitRoleBack {
	
	String[] s1= {"Harsh", "Adi","Chaitu","Rohu","Ganu","Sanku"};
	String[][] savepoint= new String[10][];
	int savepointIndex=0;
	
	public void addName(String name) {
		
		String[] ans=new String[s1.length+1];
		for (int i = 0; i < ans.length; i++) {
			if(i<ans.length-1) {
				ans[i]=s1[i];
			}
			else {
				ans[i]=name;
			}
		}
		System.out.println(Arrays.toString(ans));
		s1=ans;
		savepoint[savepointIndex]=s1;
		savepointIndex++;
	}
	public void removeName(String name) 
	{
		
		int i;
		for ( i = 0; i < s1.length; i++) {
			
			if (s1[i].equals(name) ) {
				break;
			}
		}
		
			String[] ans=new String[s1.length-1];
			
			for (int j = 0; j <= ans.length; j++) {
				if (j<i) {
					ans[j]=s1[j];
					
				}
				else if(i<j) {
					ans[j-1]=s1[j];
				}
			}
			System.out.println(Arrays.toString(ans));

			
			
			s1=ans;
			savepoint[savepointIndex]=s1;
			savepointIndex++;
 	}
	
	public void roleBack(int steps) {
		
		if (steps>=2 && steps<=10) {
			
			if (savepointIndex!=0) {
				s1=savepoint[savepointIndex-steps];
			}
			else {
				System.out.println("No save point found!");
			}
		}
		else {
			System.out.println("Invalid rollback steps! ");
		}
		System.out.println(Arrays.toString(s1));
	}
	
	public boolean commit() {
		Arrays.fill(savepoint, null);
		savepointIndex=0;
		return true;
	}
}
