public class Q5 {

    String title;
    String author;
    double price;
    static String publisher = "ABC Publishers";

    Q5(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Publisher: " + publisher);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        String t = "Java Programming";
        String a = "James Gosling";
        double p = 450;

        Q5 b = new Q5(t, a, p);
        b.display();
    }
}