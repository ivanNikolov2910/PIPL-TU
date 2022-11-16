package lab_exercises.lab_5.exceptions;

public class WrongUserException extends Exception {

    @Override
    public String getMessage() {
        return "Invalid username";
    }
}
