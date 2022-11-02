package lab_exercises.lab_3.vehicle;

public class Car extends Vehicle implements IsLandVehicle{

    private int enginePower;
    public Car(int maxSpeed, String model, double price, int enginePower) {
        super(maxSpeed, model, price);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public void enterLand() {
        System.out.println("gotovo");
    }

    @Override
    public double checkPromo() {
        return this.getPrice() + this.getPrice() * 2/10;
    }
}
