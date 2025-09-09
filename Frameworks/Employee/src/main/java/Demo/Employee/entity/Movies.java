package Demo.Employee.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Entity
@Table (name = "MoviesDB")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="EmpId")
    private int id;

    @Column(name="Name")
    private String name;

    @Column(name="IMDB")
    private double imdb;

    @Column(name="Director")
    private String director;

    public  Movies(){}
    public Movies(String name, double imdb, String director){
        this.name=name;
        this.imdb=imdb;
        this.director=director;
    }

    public String getMovieName(){
        return name;
    }

    public double getImdb() {
        return imdb;
    }

    public String getDirector() {
        return director;
    }

    public java.lang.String toString(){
        return "[ Name: "+name+" IMDB: "+imdb+"Director: "+director+" ]";
    }


}
