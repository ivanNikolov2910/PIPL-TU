package lab_exercises.lab_5.exceptions;

public class WrongPasswordException extends Exception {

    @Override
    public String getMessage() {
        return "Invalid password";
    }
}

