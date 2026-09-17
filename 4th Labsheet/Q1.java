public class Q1 {

    String name;
    int age;
    static int count = 0;

    Q1(String n, int a) {
        name = n;
        age = a;
        count++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        String name1 = "Rahul";
        int age1 = 20;

        String name2 = "Priya";
        int age2 = 19;

        Q1 s1 = new Q1(name1, age1);
        Q1 s2 = new Q1(name2, age2);

        s1.display();
        s2.display();

        System.out.println("Total Students: " + count);
    }
}