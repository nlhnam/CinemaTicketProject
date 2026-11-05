package cinejava.model;

public class Ticket {
    private String id;
    private String movieName;
    private double basePrice;

    public String getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Ticket ID cannot be null or empty");
        }
        this.id = id.trim();
    }

    public void setMovieName(String movieName) {
        if (movieName == null || movieName.trim().isEmpty()) {
            throw new IllegalArgumentException("Movie name cannot be null or empty");
        }
        this.movieName = movieName.trim();
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
        if (basePrice < 0) {
            throw new IllegalArgumentException("Base price need to >= 0");
        }
    }

    public Ticket(String id, String movieName, double basePrice) {
        setId(id);
        setMovieName(movieName);
        setBasePrice(basePrice);
    }

    public double finalPrice() {
        return basePrice;
    }

    public void printTicket() {
        System.out.printf("%-5s | %-12s | %,10.0f%n", id, movieName, finalPrice());
    }

}
