package string_problems;

public class Palindrome {

    /**
     * INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     * <p>
     * Example: MOM, DAD, MADAM, RACECAR
     * <p>
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
        String str = "Radar", reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        } else System.out.println(str + " is not a Palindrome String.");
        // Implement here

    }
}

