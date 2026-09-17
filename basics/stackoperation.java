import java.util.Scanner;

class Stack {
    int[] stack;
    int top;
    int size;

    Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed.");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println(stack[top] + " popped.");
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Stack 1: ");
        int size1 = sc.nextInt();

        System.out.print("Enter size of Stack 2: ");
        int size2 = sc.nextInt();

        Stack s1 = new Stack(size1);
        Stack s2 = new Stack(size2);

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Push in Stack 1");
            System.out.println("2. Push in Stack 2");
            System.out.println("3. Pop from Stack 1");
            System.out.println("4. Pop from Stack 2");
            System.out.println("5. Peek Stack 1");
            System.out.println("6. Peek Stack 2");
            System.out.println("7. Display Stack 1");
            System.out.println("8. Display Stack 2");
            System.out.println("9. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value for Stack 1: ");
                    int value1 = sc.nextInt();
                    s1.push(value1);
                    break;

                case 2:
                    System.out.print("Enter value for Stack 2: ");
                    int value2 = sc.nextInt();
                    s2.push(value2);
                    break;

                case 3:
                    s1.pop();
                    break;

                case 4:
                    s2.pop();
                    break;

                case 5:
                    s1.peek();
                    break;

                case 6:
                    s2.peek();
                    break;

                case 7:
                    s1.display();
                    break;

                case 8:
                    s2.display();
                    break;

                case 9:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}
