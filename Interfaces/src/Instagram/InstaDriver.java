package Instagram;

public class InstaDriver {

	public static void main(String[] args) {
		
		Insta i1=new InstaImpl2();
		i1.post("Too Good To Be True! ❤️❤️", "harshal");
		
		i1.like("rohit");
		i1.comment("aditya", "true 🙌🙌");
		i1.story("Feeling Worm 😶‍🌫️😶‍🌫️", "harsh");
		i1.message("hello!", "jay");
	}
}
