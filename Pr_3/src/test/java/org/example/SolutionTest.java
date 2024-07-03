package org.example;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void solution() {
        Solution solution = new Solution();

        assertEquals(3, solution.solution("aaa"), "Test is passed");
        assertEquals(0, solution.solution(" "), "Test is passed");
        assertEquals(0, solution.solution("1"), "Test is passed");
    }
}