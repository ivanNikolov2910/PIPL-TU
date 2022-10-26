package lab_exercises.lab_2.school;

public class Student extends Person{
    private String fNum;

    public Student(String name, String egn, String fNum) {
        super(name, egn);
        this.fNum = fNum;
    }

    public String getfNum() {
        return fNum;
    }

    public void setfNum(String fNum) {
        this.fNum = fNum;
    }
}
