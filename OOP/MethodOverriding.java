
class Parent {
    void show() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is the child class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        p.show();
        c.show();
    }
}
