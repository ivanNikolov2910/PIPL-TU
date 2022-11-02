package lab_exercises.lab_3.vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(180, "X", 123000, 120);
        Ship ship = new Ship(180, "X", 123000, 6700);
        Hovercraft hovercraft = new Hovercraft(180, "X", 123000, 14);

        ship.enterSea();
        System.out.println("Hovercraft promo: " + hovercraft.checkPromo());

    }
}
