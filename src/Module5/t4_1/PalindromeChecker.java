package Module5.t4_1;

public class PalindromeChecker {

    public boolean isPalindrome(String text) {
        text = cleanString(text);
        return text.equals(reverseString(text));
    }
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public String cleanString(String input) {
        return input.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }
}
