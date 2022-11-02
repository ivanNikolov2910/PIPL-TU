package lab_exercises.lab_3.vehicle;

public class Hovercraft extends Vehicle implements IsLandVehicle, IsSeaVehicle{

    private int passengers;

    public Hovercraft(int maxSpeed, String model, double price, int passangers) {
        super(maxSpeed, model, price);
        this.passengers = passangers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public void enterLand() {
        System.out.println("gotovo");
    }

    @Override
    public void enterSea() {
        System.out.println("gotovo");
    }

    @Override
    public double checkPromo() {
        return this.getPrice() + this.getPrice() * 3/100;
    }
}
