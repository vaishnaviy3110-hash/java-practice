
public class PalindromeString {

    public static void main(String[] args) {

        String str = "MADAM";
        String reversed = "";

        // Reverse the original string
        for (int i = str.length() - 1; i >= 0; i--) {

            reversed = reversed + str.charAt(i);
        }

        // Compare original and reversed strings
        if (str.equals(reversed)) {

            System.out.println(str + " is a Palindrome.");

        } else {

            System.out.println(str + " is not a Palindrome.");
        }
    }
}
