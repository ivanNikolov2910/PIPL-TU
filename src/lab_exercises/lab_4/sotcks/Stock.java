package lab_exercises.lab_4.sotcks;

public abstract class Stock {
    private double price;
    private int id;

    public Stock(double price, int id) throws PriceException {
        this.setPrice(price);
        this.id = id;
    }

    public abstract double checkPromo();

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) throws PriceException{
        if (price < 0){
            throw new PriceException();
        }else {
            this.price = price;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
