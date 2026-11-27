
public class WordCount {

    public static void main(String[] args) {

        String str = "Java is easy to learn";

        // Remove leading and trailing spaces
        str = str.trim();

        int count = 0;

        // Check whether the string is not empty
        if (!str.isEmpty()) {

            // Split sentence into words
            String[] words = str.split("\\s+");

            count = words.length;
        }

        System.out.println("Original Sentence: " + str);
        System.out.println("Total Number of Words: " + count);
    }
}
