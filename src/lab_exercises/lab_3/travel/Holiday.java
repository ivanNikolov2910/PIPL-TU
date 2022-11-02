package lab_exercises.lab_3.travel;

public class Holiday extends Travel{

    private String hotelName;

    public Holiday(String destination, int days, double price, String hotelName) {
        super(destination, days, price);
        this.hotelName = hotelName;
    }

    @Override
    public void fixPrice() {
        this.setPrice(this.getPrice() + this.getPrice()*4/10);
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
