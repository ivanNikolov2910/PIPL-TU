package lab_exercises.lab_5.exceptions;

public class WrongPhoneNumberException extends Exception {

    @Override
    public String getMessage() {
        return "Invalid phone number";
    }
}

