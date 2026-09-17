import java.util.Scanner;

class HeightClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height in cm: ");
        int height = sc.nextInt();

        if (height < 150) {
            System.out.println("Short");
        }
        else if (height >= 150 && height <= 170) {
            System.out.println("Average");
        }
        else {
            System.out.println("Tall");
        }

        sc.close();
    }
}