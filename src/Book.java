public class Book {
    private String title;
    private String author;
    private String genre;
    private int quantity;
    private int borrowedQuantity;

    public Book(
            String title,
            String author,
            String genre,
            int quantity
    ) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.quantity = quantity;
        this.borrowedQuantity = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getBorrowedQuantity() {
        return borrowedQuantity;
    }

    public void borrowBook() {
        if (borrowedQuantity < quantity) {
            borrowedQuantity++;
        }
    }

    public void returnBook() {
        if (borrowedQuantity > 0) {
            borrowedQuantity--;
        }
    }

    public void addStock(int quantity) {
        this.quantity += quantity;
    }

    public void removeStock(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nGenre: " + genre + "\nQuantity: " + quantity;
    }
}
