package lab_exercises.lab_3.travel;

public class Excursion extends Travel implements CntNights{

    private int hotelCnt;

    public Excursion(String destination, int days, double price, int hotelCnt) {
        super(destination, days, price);
        this.hotelCnt = hotelCnt;
    }

    @Override
    public void fixPrice() {
        this.setPrice(this.getPrice() + this.getPrice()*1/10);
    }

    public int getHotelCnt() {
        return hotelCnt;
    }

    public void setHotelCnt(int hotelCnt) {
        this.hotelCnt = hotelCnt;
    }

    @Override
    public int ensureNights() {
        return this.getDays() - 1;
    }
}
