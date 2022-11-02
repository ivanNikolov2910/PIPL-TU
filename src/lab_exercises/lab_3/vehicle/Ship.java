package lab_exercises.lab_3.vehicle;

public class Ship extends Vehicle implements IsSeaVehicle{
    private double deadWeight;

    public Ship(int maxSpeed, String model, double price, double deadWeight) {
        super(maxSpeed, model, price);
        this.deadWeight = deadWeight;
    }

    public double getDeadWeight() {
        return deadWeight;
    }

    public void setDeadWeight(double deadWeight) {
        this.deadWeight = deadWeight;
    }

    @Override
    public void enterSea() {
        System.out.println("gotovo");
    }

    @Override
    public double checkPromo() {
        return this.getPrice() + this.getPrice() * 0.3/100;
    }
}
