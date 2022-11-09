package lab_exercises.lab_4.sotcks;

public class PowerException extends Exception{

    @Override
    public String getMessage() {
        return "Power value is not correct";
    }
}
