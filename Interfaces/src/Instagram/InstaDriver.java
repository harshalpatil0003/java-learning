package Instagram;

public class InstaDriver {

	public static void main(String[] args) {
		Insta i1=new InstaImpl1();
		i1.post("Too Good To Be True! ❤️❤️", "harshal");
		
		i1.like("rohit");
		i1.comment("aditya", "true 🙌🙌");
	}
}
