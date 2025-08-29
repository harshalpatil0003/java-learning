package Queue;

import java.util.Arrays;

public class PlaylistDriver {

	public static void main(String[] args) {
		
		Playlist p= new Playlist(5, "Party Pop");
		//System.out.println(p.getArraysize());
		//System.out.println(p.getArray());
		p.addSongs("Laal pari", "Housefull5", "yoyo honey singh", "Alfaaz", "5:00");
		p.addSongs("Naina", "Dangal", "Arijit Singh", "Amitabh bhatacharya", "4:00");
		p.addSongs("Humari Adhuri kahani ", "kahani", "Arijit", "Harshal", "5:00");
		p.addSongs("O Mahi", "Dunki", "Arijit Singh", "Irshad Kamil", "5:00");

		p.addSongs("Raabta", "Raabta", "Arijit Singh", "Alfaaz", "5:00");
		//p.addSongs("O Mahiii", "Dunki", "Arijit Singh", "Irshad Kamil", "5:00");
		
		
		
		//p.removeSong("Raabta", "Raabta");
		
		//p.searchSong("Raabta", "Raabta");
		//p.playNext("O Mahi", "Dunki");
		p.shuffle();
		p.getPlaylist();
	}
}
 
