package Instagram;

public class InstaImpl2 extends InstaImpl1{

	public void story(String story,String user) {
		System.out.println(story);
		System.out.println(user+" Posted a story 📷");
		System.out.println("------------------------");
	}
	public void message(String msg,String name) {
		System.out.println(msg);
		System.out.println(name+" send a message ✍️");
		System.out.println("------------------------");
	}
}
