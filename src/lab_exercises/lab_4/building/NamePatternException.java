package lab_exercises.lab_4.building;

public class NamePatternException extends Exception{
    @Override
    public String getMessage() {
        return "Name does not follow pattern";
    }
}
