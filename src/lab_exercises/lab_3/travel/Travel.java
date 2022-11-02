package lab_exercises.lab_3.travel;

public abstract class Travel {
    private String destination;
    private int days;
    private double price;

    public Travel(String destination, int days, double price) {
        this.destination = destination;
        this.days = days;
        this.price = price;
    }

    public abstract void fixPrice();

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
