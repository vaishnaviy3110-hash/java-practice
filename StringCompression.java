
public class StringCompression {

    public static void main(String[] args) {

        String str = "aaabbc";

        String compressed = "";

        int count = 1;

        // Traverse the string
        for (int i = 0; i < str.length(); i++) {

            // Check whether the next character is the same
            if (i + 1 < str.length() &&
                str.charAt(i) == str.charAt(i + 1)) {

                count++;

            } else {

                // Add character and its frequency
                compressed = compressed + str.charAt(i) + count;

                count = 1;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Compressed String: " + compressed);
    }
}
