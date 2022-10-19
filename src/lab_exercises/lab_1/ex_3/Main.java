package lab_exercises.lab_1.ex_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BMICalculator bmiCalculator = new BMICalculator();
        BMICalculator.printIntroduction();
        bmiCalculator.bmi = bmiCalculator.getBMI(new Scanner(System.in));
        bmiCalculator.getStatus();
        bmiCalculator.ReportResult(new Scanner(System.in).next(), bmiCalculator.bmi, bmiCalculator.getStatus());
    }
}
