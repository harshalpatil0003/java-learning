package Instagram;

public class InstaDriver {

	public static void main(String[] args) {
		Insta i1=new InstaIml1();
		i1.login("harsh", "123");
		i1.post("Too Good To Be True! ❤️❤️", "harshal");
		
		i1.like("rohit");
		i1.comment("aditya", "true 🙌🙌");
	}
}
