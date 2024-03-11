package Module5.t4_1;

import Module5.t4_1.PalindromeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
    @Test
    public void testIsPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();

        Assertions.assertTrue(checker.isPalindrome("radar"));
        Assertions.assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
        Assertions.assertFalse(checker.isPalindrome("hello"));
        Assertions.assertFalse(checker.isPalindrome("openai"));
    }
    @Test
    public void testSpecialCharacters() {
        PalindromeChecker checker = new PalindromeChecker();
        Assertions.assertEquals("radar", checker.cleanString("ra!&%¤/(/=())¤* ,.dar"));

    }

    @Test
    public void testReverseString() {
        PalindromeChecker checker = new PalindromeChecker();
        Assertions.assertEquals("ariok", checker.reverseString("koira"));
    }
}
