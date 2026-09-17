public class Q14 {

    String name;
    int age;
    static String country = "India";

    Q14(String n, int a) {
        name = n;
        age = a;
    }

    void checkEligibility() {
        int votingAge = 18;
        boolean eligible = age >= votingAge;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);

        if (eligible) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
    }

    public static void main(String[] args) {

        String n = "Rahul";
        int a = 20;

        Q14 p = new Q14(n, a);
        p.checkEligibility();
    }
}