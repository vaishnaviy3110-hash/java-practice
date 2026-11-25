
public class RemoveSpaces {

    public static void main(String[] args) {

        String str = "Java Programming is Easy";
        String result = "";

        // Traverse each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Add character only if it is not a space
            if (ch != ' ') {

                result = result + ch;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("String Without Spaces: " + result);
    }
}
