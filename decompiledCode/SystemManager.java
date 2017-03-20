import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemManager
{
  private static SystemManager instance;
  private Map<Movie, Integer> placedTickets;
  public List<Ticket> tickets;
  
  private SystemManager()
  {
    this.placedTickets = new HashMap();
    this.tickets = new ArrayList();
  }
  
  public static SystemManager getInstance()
  {
    if (instance != null) {
      return instance;
    }
    instance = new SystemManager();
    return instance;
  }
  
  public Ticket getTicket(Movie m)
  {
    for (Ticket t : this.tickets) {
      if (t.getMovie() == m)
      {
        this.placedTickets.put(m, Integer.valueOf(((Integer)this.placedTickets.get(m)).intValue() - 1));
        return t;
      }
    }
    return null;
  }
  
  public void addMovie(Movie m, Integer places, Sala s, Double price)
  {
    this.placedTickets.put(m, places);
    for (int i = 0; i < places.intValue(); i++) {
      this.tickets.add(new Ticket(m, price, s));
    }
  }
}
