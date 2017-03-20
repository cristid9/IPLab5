import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemManager {

    private static SystemManager instance;

    private Map<Movie, Integer> placedTickets;

    public List<Ticket> tickets;

    private SystemManager() {
        placedTickets = new HashMap<>();
        tickets = new ArrayList<>();
    }

    public static SystemManager getInstance() {
        if (instance != null) {
            return instance;
        } else {
            instance = new SystemManager();
            return instance;
        }
    }

    public Ticket getTicket(Movie m) {
        for (Ticket t : tickets) {
            if (t.getMovie() == m) {
                placedTickets.put(m, placedTickets.get(m) - 1);
                return t;
            }
        }

        return null;
    }

    public void addMovie(Movie m, Integer places, Sala s, Double price) {
        placedTickets.put(m, places);
        for (int i = 0; i < places; ++i) {
            tickets.add(new Ticket(m, price, s));
        }
    }
}