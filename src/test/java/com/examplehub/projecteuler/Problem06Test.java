package com.examplehub.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem06Test {

    @Test
    void testSolution1() {
        assertEquals(2640, Problem06.solution1(10));
        assertEquals(25164150, Problem06.solution1(100));
    }
}