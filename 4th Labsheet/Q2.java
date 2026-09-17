public class Q2 {

    double length;
    double breadth;
    static String shapeName = "Rectangle";

    Q2(double l, double b) {
        length = l;
        breadth = b;
    }

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Shape: " + shapeName);
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {

        double l = 10;
        double b = 5;

        Q2 r = new Q2(l, b);
        r.calculateArea();
    }
}