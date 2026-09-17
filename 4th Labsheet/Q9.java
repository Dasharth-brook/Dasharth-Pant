public class Q9 {

    String brand;
    int RAM;
    static String os = "Windows";

    Q9(String b, int r) {
        brand = b;
        RAM = r;
    }

    void display() {
        String laptopBrand = brand;
        int laptopRAM = RAM;

        System.out.println("Brand: " + laptopBrand);
        System.out.println("RAM: " + laptopRAM + " GB");
        System.out.println("OS: " + os);
    }

    public static void main(String[] args) {

        String b = "Dell";
        int r = 8;

        Q9 l = new Q9(b, r);
        l.display();
    }
}
