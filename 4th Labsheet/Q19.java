public class Q19 {

    int id;
    String name;
    double price;
    static double discountRate = 10;

    Q19(int i, String n, double p) {
        id = i;
        name = n;
        price = p;
    }

    void calculatePrice() {
        double discount = price * discountRate / 100;
        double finalPrice = price - discount;

        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Discount: " + discountRate + "%");
        System.out.println("Final Price: ₹" + finalPrice);
    }

    public static void main(String[] args) {

        int i = 101;
        String n = "Laptop";
        double p = 50000;

        Q19 product = new Q19(i, n, p);
        product.calculatePrice();
    }
}