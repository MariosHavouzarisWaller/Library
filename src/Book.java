public class Book extends Author{
    // Object variables
    private String bookName;
    private double price;
    private int qty;

    // Constructor
    public Book(String bookName, String name, String email, char gender, double price, int qty) {
        super(name, email, gender); // Calls the Author super class and acquires its variables
        this.bookName = bookName;
        this.price = price;
        this.qty = qty;
    }

    // Getters and Setters
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
