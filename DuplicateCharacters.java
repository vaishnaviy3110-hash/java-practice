
public class DuplicateCharacters {

    public static void main(String[] args) {

        String str = "programming";

        str = str.toLowerCase();

        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            frequency[ch]++;
        }

        System.out.println("Duplicate Characters:");

        // Display characters appearing more than once
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (frequency[ch] > 1) {

                System.out.println(ch + " : " + frequency[ch]);

                // Reset frequency to avoid repetition
                frequency[ch] = 0;
            }
        }
    }
}
