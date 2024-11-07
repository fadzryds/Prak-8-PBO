public class Book {
    private String title;
    private String author;
    private String isbn;
    public static int totalBooks = 0;
    public Book(String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    totalBooks++;
    }
    public static void displayTotalBooks() {
    System.out.println("Total books: " + totalBooks);
    }

    public static void main(String[] args) {
        // Membuat beberapa objek Book
        Book buku1 = new Book("Dilan", "Author 1", "ISBN001");
        Book buku2 = new Book("Balc house", "Author 2", "ISBN002");
        Book buku3 = new Book("Bumi Manusia", "Author 3", "ISBN003");

        Book.displayTotalBooks();
    }
    
    }