package Queue;


import java.util.Objects;

public class Songs {

	private String name;
	private String movie;
	private String singer;
	private String writer;
	private String duration;
	
	public Songs() {
		// TODO Auto-generated constructor stub
	}

	public Songs(String name, String movie, String singer, String writer, String duration) {
		super();
		this.name = name;
		this.movie = movie;
		this.singer = singer;
		this.writer = writer;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public String getMovie() {
		return movie;
	}

	public String getSinger() {
		return singer;
	}

	public String getWriter() {
		return writer;
	}

	public String getDuration() {
		return duration;
	}

	@Override
	public String toString() {
		return "name: " + name ;
				//+ ", movie: " + movie;
				
//				+ ", singer: " + singer + ", writer: " + writer + ", duration: "
	//			+ duration;
	}

	@Override
	public int hashCode() {
		return (name.hashCode()+movie.hashCode()+singer.hashCode()+writer.hashCode()+duration.hashCode());
	}

	@Override
	public boolean equals(Object o) {
		Songs s= (Songs)o;
		return (s.name.equalsIgnoreCase(name) && s.movie.equalsIgnoreCase(movie) && s.writer.equalsIgnoreCase(writer) && s.duration.equals(duration) && s.singer.equalsIgnoreCase(singer) );
	}
}
