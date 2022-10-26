package lab_exercises.lab_2.school;

public class Main {
    public static void main(String[] args) {
        Teacher[] teachers = {
                new Teacher("Stoqn", new Course("PIPL")),
                new Teacher("Ivan", new Course("SAA")),
                new Teacher("Najden", new Course("Math3"))
        };

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
