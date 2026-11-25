
public class CountVowelsConsonants {

    public static void main(String[] args) {

        String str = "Hello Java Programming";

        int vowels = 0;
        int consonants = 0;

        // Convert string into lowercase
        str = str.toLowerCase();

        // Traverse each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {

                    vowels++;

                } else {

                    consonants++;
                }
            }
        }

        System.out.println("Original String: Hello Java Programming");
        System.out.println("Total Vowels: " + vowels);
        System.out.println("Total Consonants: " + consonants);
    }
}
