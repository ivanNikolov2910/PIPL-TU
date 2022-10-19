package lab_exercises.lab_1.ex_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cv = new String[10];
        cv[0] = scanner.nextLine();
        cv[1] = scanner.nextLine();
        cv[2] = scanner.nextLine();
        cv[3] = scanner.nextLine();

        for (String s : cv) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}
