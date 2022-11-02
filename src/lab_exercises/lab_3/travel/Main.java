package lab_exercises.lab_3.travel;

public class Main {
    public static void main(String[] args) {
        Holiday holiday = new Holiday("nekde", 5, 750, "H1");
        holiday.fixPrice();
        System.out.println(holiday.getPrice());

        Excursion excursion = new Excursion("nekdene", 7, 550, 3);
        System.out.println(excursion.ensureNights());

    }
}
