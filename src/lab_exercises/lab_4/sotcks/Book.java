package lab_exercises.lab_4.sotcks;

public class Book extends Stock{

    private String title;
    private String author;

    public Book(int id, String title, String author, double price) throws PriceException {
        super(price, id);
        this.title = title;
        this.author = author;
    }

    @Override
    public double checkPromo() {
        return this.getPrice() - this.getPrice()*15/100;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
