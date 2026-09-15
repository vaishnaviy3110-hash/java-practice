interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

class Child implements Father, Mother {

    public void fatherProperty() {
        System.out.println("Property inherited from Father");
    }

    public void motherProperty() {
        System.out.println("Property inherited from Mother");
    }
}

public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        Child child = new Child();

        child.fatherProperty();
        child.motherProperty();
    }
}
