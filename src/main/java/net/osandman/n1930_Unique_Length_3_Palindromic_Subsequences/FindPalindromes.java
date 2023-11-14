package net.osandman.n1930_Unique_Length_3_Palindromic_Subsequences;

import java.util.HashSet;
import java.util.Set;

public class FindPalindromes {
    public int countPalindromicSubsequenceFirstEdition(String s) {
        Set<String> findedPalindromes = new HashSet<>();
        Set<Character> usedSymbols = new HashSet<>();
        int left;
        for (int i = 0; i < s.length() - 2; i++) {
            char current = s.charAt(i);
            left = i + 1;
            if (usedSymbols.add(current)) {
                for (int j = i + 2; j < s.length(); j++) {
                    if (current == s.charAt(j)) {
                        for (int k = left; k < j; k++) {
                            findedPalindromes.add(String.valueOf(current) + s.charAt(k) + current);
                        }
                        left = j;
                    }
                }
            }
        }
        return findedPalindromes.size();
    }

    public int countPalindromicSubsequence(String s) {
        Set<Character> letters = new HashSet<>(26);
        for (char ch : s.toCharArray()) {
            letters.add(ch);
        }

        int result = 0;
        for (char ch : letters) {
            Set<Character> middleLetters = new HashSet<>(26);
            int leftIndex;
            int rightIndex;
            if ((leftIndex = findLeftIndex(ch, s)) != -1) {
                if ((rightIndex = findRightIndex(ch, s)) != -1) {
                    if (leftIndex < rightIndex) {
                        for (int i = leftIndex + 1; i < rightIndex; i++) {
                            middleLetters.add(s.charAt(i));
                        }
                    }
                    result += middleLetters.size();
                }
            }
        }
        return result;
    }

    private static int findLeftIndex(char ch, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    private static int findRightIndex(char ch, String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (ch == s.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}
