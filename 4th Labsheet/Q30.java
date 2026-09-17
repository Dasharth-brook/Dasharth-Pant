public class Q30 {

    int booksAvailable;
    static String libraryName = "City Library";

    Q30(int b) {
        booksAvailable = b;
    }

    void issueBook() {
        int issueBooks = 2;

        if (issueBooks <= booksAvailable) {
            booksAvailable = booksAvailable - issueBooks;
            System.out.println("Books Issued: " + issueBooks);
        } else {
            System.out.println("Books Not Available");
        }
    }

    void returnBook() {
        int returnBooks = 1;
        booksAvailable = booksAvailable + returnBooks;

        System.out.println("Books Returned: " + returnBooks);
    }

    void display() {
        System.out.println("Library: " + libraryName);
        System.out.println("Books Available: " + booksAvailable);
    }

    public static void main(String[] args) {

        int b = 10;

        Q30 l = new Q30(b);

        l.display();
        l.issueBook();
        l.returnBook();
        l.display();
    }
}