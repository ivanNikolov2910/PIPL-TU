package lab_exercises.lab_4.building;

public class Main {
    public static void main(String[] args) {
        House[] houses = new House[3];
        try {
            houses[0] = new House(5, 140, "st. somewhere 2", 2, "Mark Who");
            houses[1] = new House(9, 260, "st. somewhere 11", 3, "Mark Whothesecond");
            houses[2] = new House(5, 150, "st. somewhere 33", 3, "Mark Whothethird");
        } catch (MetricException | NamePatternException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(House.takeLargestHouse(houses));
        }catch (NullPointerException e){
            System.err.println(e.getMessage());
        }
    }

}
