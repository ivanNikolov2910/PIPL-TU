package lab_exercises.lab_2.school_2;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Hristo", "Daskalov", new Date(2000, Calendar.DECEMBER, 23), "121221122");

        s1.setGradeForCourse(Course.PIK, 4.12);
        s1.setGradeForCourse(Course.TE, 3.2);
        s1.setGradeForCourse(Course.PPE, 5.6);

        System.out.println(s1);

    }
}
