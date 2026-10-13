
class Student {
    int rollNo;
    String name;
    static String college = "MDU";

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    static void showCollege() {
        System.out.println("College: " + college);
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Aman");
        Student s2 = new Student(2, "Riya");

        s1.display();
        s2.display();

        Student.showCollege();
    }
}
