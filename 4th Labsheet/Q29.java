public class Q29 {

    String name;
    double salary;
    static String organization = "ABC Company";

    Q29(String n, double s) {
        name = n;
        salary = s;
    }

    void compareSalary(Q29 e2) {
        double salary1 = salary;
        double salary2 = e2.salary;

        System.out.println("Organization: " + organization);
        System.out.println("Employee 1: " + name);
        System.out.println("Salary: ₹" + salary1);
        System.out.println("Employee 2: " + e2.name);
        System.out.println("Salary: ₹" + salary2);

        if (salary1 > salary2) {
            System.out.println(name + " has higher salary.");
        } else if (salary2 > salary1) {
            System.out.println(e2.name + " has higher salary.");
        } else {
            System.out.println("Both employees have equal salary.");
        }
    }

    public static void main(String[] args) {

        String n1 = "Rahul";
        double s1 = 50000;

        String n2 = "Priya";
        double s2 = 45000;

        Q29 e1 = new Q29(n1, s1);
        Q29 e2 = new Q29(n2, s2);

        e1.compareSalary(e2);
    }
}