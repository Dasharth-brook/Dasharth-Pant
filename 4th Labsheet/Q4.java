public class Q4 {

    int empId;
    double salary;
    static String companyName = "ABC Company";

    Q4(int id, double s) {
        empId = id;
        salary = s;
    }

    void display() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        int id = 101;
        double s = 50000;

        Q4 e = new Q4(id, s);
        e.display();
    }
}