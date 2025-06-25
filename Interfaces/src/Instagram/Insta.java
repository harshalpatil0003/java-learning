package Instagram;

public interface Insta {

	void post(String post,String user);
	void like(String name);
	void comment(String name,String comment);
	void story(String story , String user);
	void message(String msg,String name);
	
}
