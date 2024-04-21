package src.programmingChallenges.classesAndObjects;

class Book {
    static int totalBooks;
    String title;
    String author;
    int isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    { // object init
        totalBooks++;
    }

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(int isbn) {
        this("unknown", "unknown", isbn);
    }

    public static int getTotalNoOfBooks() {
        return totalBooks;
    }

    public void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy "+this.title);
        }

    }

    public void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you have enjoyed, please leave a review");
        } else {
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("Design", "Author", 1);
        Book myBook = new Book(2);
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}

