public class Ticket {

    protected Movie movie;
    protected Double price;
    protected Sala sala;

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Movie getMovie() {
        return movie;
    }

    public Double getPrice() {
        return price;
    }

    public Sala getSala() {
        return sala;
    }

    public Ticket(Movie movie, Double price, Sala sala) {
        this.movie = movie;
        this.price = price;
        this.sala = sala;
    }
}