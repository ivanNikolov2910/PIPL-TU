package lab_exercises.lab_4.sotcks;

public class PriceException extends Exception{

    @Override
    public String getMessage() {
        return "Price is not correct";
    }
}
