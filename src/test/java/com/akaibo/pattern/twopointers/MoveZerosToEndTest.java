package com.akaibo.pattern.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZerosToEndTest {
    @Test
    void testMoveZerosToEnd() {
        MoveZerosToEnd moveZerosToEnd = new MoveZerosToEnd();
        int[] input = { 0, 1, 2, 0, 3, 4, 5, 6, 0 };
        int[] res = moveZerosToEnd.moveZeros(input);

        assertArrayEquals(new int[] {6, 1, 2, 5, 3, 4, 0, 0, 0}, res);
    }
}
