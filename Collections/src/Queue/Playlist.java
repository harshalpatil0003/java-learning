package Queue;

import java.util.Arrays;

public class Playlist {

//	private String userId;
//	private String pass;
	private int count;
	private int cap;
	private String name;
	private Songs[] s;
	
	public Playlist() {
		// TODO Auto-generated constructor stub
	}
	public Playlist(int cap, String name) {
		super();
//		this.userId = userId;
//		this.pass = pass;
		this.cap = cap;
		this.name = name;
		s =new Songs[cap];
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Songs[] getS() {
		return s;
	}
	public void setS(Songs[] s) {
		this.s = s;
	}
	public int getArraysize() {
		return s.length;
	}
	public String getArray() {
		return Arrays.toString(s);
	}
	
	public boolean addSongs(String name, String movie, String singer, String writer, String duration) {
		if (count<s.length) {
			
			Songs tobeAdded = new Songs(name, movie, singer, writer, duration);
			int i;
			for (i = 0; i < count; i++) {
				
				if (s[i].equals(tobeAdded)) {
					break;
				}
				
			}
			if (i==count) {
				s[count]=tobeAdded;
				count++;
				return true;
			}
			else {
				System.out.println("Song already present!");
			}
		}
		else {
			System.out.println("Playlist is full!");
		}
		return false;
	}
	
	public void getPlaylist() {
		for (int i = 0; i < count; i++) {
			if (s[i]!=null) {
				System.out.println(Arrays.toString(s));
				break;
			}
			else {
				System.out.println("Playlist is empty! ");
				break;
			}
		}
	}
	
	public boolean removeSong(String name, String movie) {
		if (count!=0) {
			boolean found =false;
			int i;
			for (i = 0; i < count-1; i++) {
				if (!found) {
					if (s[i].getName().equalsIgnoreCase(name)&& s[i].getMovie().equalsIgnoreCase(movie)) {
						s[i]=null;
						found=true;
					}
				}
				else {
					s[i-1]=s[i];
				}
			}
			if (found) {
				System.out.println(name+"song removed!");
				s[i]=null;
				count--;
			}else {
				System.out.println(name+" song not found!");
			}	
			return found;
			
		}
		else {
			System.out.println("Empty Playlist!");
			return false;
		}
	}
	
	public void playNext(String name, String movie) {
		
			int indx=searchSong(name, movie);
			
			
				if (indx==0) {
					System.out.println("Song palying....");
				}
				else if(indx==1) {
					System.out.println("Song is playing next....");
				}
				else if (indx>1) {
			
					Songs temp=s[indx];
					for (int i=indx; i >1;i--) {
						s[i]=s[i-1];
					}
					s[1]=temp;
				}
				else {
					System.out.println("Song not in playlist!");
				}
		
	}
	public int searchSong(String name, String movie) {
		for (int i = 0; i <count; i++) {
			if (s[i].getName().equalsIgnoreCase(name)&& s[i].getMovie().equalsIgnoreCase(movie)) {
				return i;
			}
		}
		return -1;
	}
	
	public void shuffle() {
		
		for (int i = count-1; i >0;) {
		int j=(int)(Math.random()*10);
			if (j>=0 && j<count) {
				Songs temp=s[i];
				s[i]=s[j];
				s[j]=temp;
				i--;
			}
		}
		
	}
}
