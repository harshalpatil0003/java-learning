
package Instagram;
public abstract class InstaImpl1 implements Insta{
	String user;
	String pass;
	
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
	public abstract void story(String story , String user);
	public abstract void message(String msg,String name);
}