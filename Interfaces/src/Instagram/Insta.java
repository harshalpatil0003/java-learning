package Instagram;

public interface Insta {

	void login(String user,String pass);
	void post(String post,String user);
	void like(String name);
	void comment(String name,String comment);
	
}
