public class Q8 {

    String color;
    String type;
    static String manufacturer = "Cello";

    Q8(String c, String t) {
        color = c;
        type = t;
    }

    void display() {
        String penColor = color;
        String penType = type;

        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Color: " + penColor);
        System.out.println("Type: " + penType);
    }

    public static void main(String[] args) {

        String c = "Blue";
        String t = "Ball Pen";

        Q8 p = new Q8(c, t);
        p.display();
    }
}