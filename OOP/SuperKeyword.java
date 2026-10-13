
class Parent {
    String name = "Parent Class";

    void display() {
        System.out.println("This is the parent method");
    }
}

class Child extends Parent {
    String name = "Child Class";

    void show() {
        System.out.println(super.name);
        super.display();
        System.out.println(name);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
