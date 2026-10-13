
class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 18;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorTypes {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Vaishnavi", 20);

        s1.display();
        s2.display();
    }
}
