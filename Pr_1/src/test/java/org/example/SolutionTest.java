package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void testSolution() {

        Solution solution = new Solution();

        assertEquals(24,solution.solution(10),"Test is passed");

    }
}