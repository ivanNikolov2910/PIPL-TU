package lab_exercises.lab_2.device;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop(500, "Intel core i3", 512, 8);
        Laptop l2 = new Laptop(500, "Intel core i5", 1024, 16);
        System.out.println("Is laptop 2 better: " + l2.isBetter(l1));
        System.out.println("Is laptop 1 better: " + l1.isBetter(l2));
        System.out.println(l2);
    }
}
