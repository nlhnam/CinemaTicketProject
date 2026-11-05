package cinejava.model;

public class VipTicket extends Ticket {
    private double surchangeRate;
    private double comboFee;

    public double getComboFee() {
        return comboFee;
    }

    public void setComboFee(double comboFee) {
        this.comboFee = comboFee;
        if (comboFee < 0) {
            throw new IllegalArgumentException("Phí combo phải >= 0");
        }
    }

    public double getSurchangeRate() {
        return surchangeRate;
    }

    public void setSurchangeRate(double surchangeRate) {
        this.surchangeRate = surchangeRate;
         if (surchangeRate < 0 || surchangeRate > 1) {
            throw new IllegalArgumentException("Phụ thu phải trong khoảng từ 0 đến 1");
        }
       
    }

    public VipTicket(String id, String movieName, double basePrice, double surchangeRate, double comboFee) {
        super(id, movieName, basePrice);
        setSurchangeRate(surchangeRate);
        setComboFee(comboFee);
    }

}
