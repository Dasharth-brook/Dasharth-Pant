public class Q12 {

    int marks1;
    int marks2;
    int marks3;
    static String universityName = "ABC University";

    Q12(int m1, int m2, int m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    void calculateAverage() {
        int total = marks1 + marks2 + marks3;
        double average = (double) total / 3;

        System.out.println("University: " + universityName);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {

        int m1 = 85;
        int m2 = 90;
        int m3 = 80;

        Q12 s = new Q12(m1, m2, m3);
        s.calculateAverage();
    }
}