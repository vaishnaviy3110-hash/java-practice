
public class StringMethods {

    public static void main(String[] args) {

        String str = "Hello Java Programming";

        // Original String
        System.out.println("Original String: " + str);

        // Find String Length
        System.out.println("Length: " + str.length());

        // Convert to Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert to Lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Find Character at a Particular Index
        System.out.println("Character at Index 6: " + str.charAt(6));

        // Extract a Part of String
        System.out.println("Substring: " + str.substring(6, 10));

        // Check Whether String Contains a Word
        System.out.println("Contains Java: " + str.contains("Java"));

        // Replace a Word
        System.out.println("Replace: " + str.replace("Java", "Python"));

        // Check Whether String Starts With
        System.out.println("Starts With Hello: " + str.startsWith("Hello"));

        // Check Whether String Ends With
        System.out.println("Ends With Programming: " + str.endsWith("Programming"));

        // Remove Leading and Trailing Spaces
        String text = "  Java Programming  ";
        System.out.println("Trimmed String: " + text.trim());

    }
}
