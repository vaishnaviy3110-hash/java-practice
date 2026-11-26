
import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        // Convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Convert strings into character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare both sorted arrays
        if (Arrays.equals(arr1, arr2)) {

            System.out.println("The strings are Anagrams.");

        } else {

            System.out.println("The strings are not Anagrams.");
        }
    }
}
