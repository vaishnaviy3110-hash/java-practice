
public class CharacterFrequency {

    public static void main(String[] args) {

        String str = "programming";

        // Convert string into lowercase
        str = str.toLowerCase();

        // Array to store frequency of characters
        int[] frequency = new int[256];

        // Count character frequency
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            frequency[ch]++;
        }

        // Display character frequency
        System.out.println("Character Frequency:");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Print each character only once
            if (frequency[ch] > 0) {

                System.out.println(ch + " : " + frequency[ch]);

                // Reset frequency to avoid repetition
                frequency[ch] = 0;
            }
        }
    }
}
