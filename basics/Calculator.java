import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char continueChoice = 'Y';

        while (continueChoice == 'Y' || continueChoice == 'y') {

            System.out.println("\n--- Simple Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1 -> System.out.println("Result = " + (num1 + num2));
                case 2 -> System.out.println("Result = " + (num1 - num2));
                case 3 -> System.out.println("Result = " + (num1 * num2));
                case 4 -> {
                    if (num2 != 0) {
                        System.out.println("Result = " + (num1 / num2));
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                }
                default -> System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to continue? (Y/N): ");
            continueChoice = sc.next().charAt(0);
        }

        System.out.println("Calculator exited.");
    }
}
