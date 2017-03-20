public class Main {

    public static void main(String[] args) {
        SystemManager sm = SystemManager.getInstance();
        Movie m = new Movie("Logan", 160);
        Sala s = new Sala("Sala s", 100);

        sm.addMovie(m, 50, s, 20.5);

        

    }
}
