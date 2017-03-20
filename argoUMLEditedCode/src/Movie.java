import java.util.Vector;

public class Movie {

    public String movieName;
    public Integer duration;

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getDuration() {
        return duration;
    }



    public Movie(String movieName, Integer duration) {
        this.movieName = movieName;
        this.duration = duration;
    }

}