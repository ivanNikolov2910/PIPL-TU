package lab_exercises.lab_2.school_2;

import java.util.Date;
import java.util.HashMap;

public class Student extends Person{
    private String facultyNum;
    private HashMap<Course, Double> grades;

    public Student(String name, String family, Date birthDate, String facultyNum) {
        super(name, family, birthDate);
        this.facultyNum = facultyNum;
        this.grades = new HashMap<>();
    }

    public String getFacultyNum() {
        return facultyNum;
    }

    public void setFacultyNum(String facultyNum) {
        this.facultyNum = facultyNum;
    }

    public HashMap<Course, Double> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<Course, Double> grades) {
        this.grades = grades;
    }

    public void setGradeForCourse(Course course, Double grade){
        this.grades.put(course, grade);
    }

    @Override
    public String toString() {
        StringBuilder rawData = new StringBuilder();
        rawData.append(String.format("Name %s %s\n", getName(), getFamily()));
        for (Course course : grades.keySet()) {
            rawData.append(String.format("Course: %s - grade: %s\n", course, this.grades.get(course)));
        }
        return rawData.toString();
    }
}
