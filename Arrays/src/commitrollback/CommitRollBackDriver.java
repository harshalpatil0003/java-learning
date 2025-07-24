package commitrollback;

import java.util.Arrays;

public class CommitRollBackDriver {

	public static void main(String[] args) {
		CommitRoleBack c1= new CommitRoleBack();
		
		c1.addName("Anni");
		c1.removeName("Chaitu");
		c1.addName("Tejus");
		c1.addName("Manibhau");
		c1.addName("Smita");
		c1.addName("Nitish");
		c1.addName("Shashi");
		c1.addName("Nirmala");
		c1.addName("Nirmala");
		c1.addName("Nirmala");
		c1.commit();
		c1.roleBack(5);	
	}
}
