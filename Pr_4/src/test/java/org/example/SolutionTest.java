package org.example;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void solution() {
        Solution solution = new Solution();
        //assertEquals("ggg",solution.solution("eeeggg"),"test is passed");
        assertEquals("gggbbb", solution.solution("eeegggbbb"), "test is passed");
    }


}