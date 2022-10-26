package lab_exercises.lab_2.school;

public class Teacher extends Person{
    private Course course;

    public Teacher(String name, Course course) {
        super(name);
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return String.format("Teacher name: %s -> course: %s", this.getName(), this.course.getName());
    }
}
