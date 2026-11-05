package cinejava.model;

public class StudentTicket extends Ticket {

    private int discountPercent;

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
        if (discountPercent < 0 || discountPercent > 50) {
            throw new IllegalArgumentException("Discount percent must be between 0 and 50");
        }
    }

      public StudentTicket(String id, String movieName, double basePrice, int discountPercent) {
        super(id, movieName, basePrice);
        setDiscountPercent(discountPercent);
    }

    @Override
    public double finalPrice() {
        return getBasePrice() * (100 - discountPercent) / 100;
    }

}