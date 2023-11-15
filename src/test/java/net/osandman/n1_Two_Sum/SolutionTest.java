package net.osandman.n1_Two_Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void check1and3IndexesForSum12() {
        assertArrayEquals(new int[]{1, 3}, new Solution().twoSum(new int[]{2, 3, 8, 9, 11, 15}, 12));
    }

    @Test
    public void check0and1IndexesForSum9() {
        assertArrayEquals(new int[]{0, 1}, new Solution().twoSum(new int[]{2, 7, 11, 15}, 9));
    }
    @Test
    public void check1and2IndexesForSum6() {
        assertArrayEquals(new int[]{1, 2}, new Solution().twoSum(new int[]{3, 2, 4}, 6));
    }
    @Test
    public void check0and1IndexesForSum6() {
        assertArrayEquals(new int[]{0, 1}, new Solution().twoSum(new int[]{3, 3}, 6));
    }
}