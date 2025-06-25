package Instagram;

public class InstaIml1 implements Insta{
	String user;
	String pass;
	public void login(String user,String pass) {
		System.out.print("Enter Username: "+user);
		System.out.println("Enter Password: "+pass);
	}
	
	
	
	public void post(String post, String user) {
		System.out.println(post);
		System.out.println(user+" Posted ✅");
		System.out.println("------------------------");
	}
	public void like(String name) {
		System.out.println(name+" liked ❤️");
		System.out.println("------------------------");
	}
	public void comment(String name,String comment) {
		System.out.println(comment);
		System.out.println(name+" Commented 💬");
		System.out.println("------------------------");
	}
}
