package net.osandman.n1930_Unique_Length_3_Palindromic_Subsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPalindromesTest {
    public static final String INPUT1 = "aabca";
    public static final String INPUT2 = "adc";
    public static final String INPUT3 = "bbcbaba";
    public static final String INPUT4 = "tlpjzdmtwderpkpmgoyrcxttiheassztncqvnfjeyxxp";
    public static final String INPUT5 = "aywvhbwycmbttdmogwlfosfizqlndfipffbqfxwbgrfdyomuuecllmsrzckiwgelkhgylwobz";
    public static final String INPUT6 = "tlptta";

    @Test
    public void findThreePalindromes() {
        assertEquals(3, new FindPalindromes().countPalindromicSubsequence(INPUT1));
    }

    @Test
    public void notFoundPalindromes() {
        assertEquals(0, new FindPalindromes().countPalindromicSubsequence(INPUT2));
    }

    @Test
    public void findFourPalindromes() {
        assertEquals(4, new FindPalindromes().countPalindromicSubsequence(INPUT3));
    }

    @Test
    public void find161Palindromes() {
        assertEquals(161, new FindPalindromes().countPalindromicSubsequence(INPUT4));
    }

    @Test
    public void find326Palindromes() {
        assertEquals(326, new FindPalindromes().countPalindromicSubsequence(INPUT5));
    }

    @Test
    public void find3Palindromes() {
        assertEquals(3, new FindPalindromes().countPalindromicSubsequence(INPUT6));
    }
}