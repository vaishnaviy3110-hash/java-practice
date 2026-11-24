
public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello Java";
        String reversed = "";

        // Traverse the string from the last character
        for (int i = str.length() - 1; i >= 0; i--) {

            reversed = reversed + str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
