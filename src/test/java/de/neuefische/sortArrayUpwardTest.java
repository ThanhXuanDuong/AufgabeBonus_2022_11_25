package de.neuefische;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class sortArrayUpwardTest {
    @Test
    void returnSortedArrayUpwardWhenGivenNums(){
        int[] actual={6, 2, 8, 3, 9, 6};
        int[] expected={2, 3, 6, 6, 8, 9};
        assertArrayEquals( expected,sortArrayUpward.sortUpward( actual));
    }

    @Test
    void returnSortedArray2UpwardWhenGivenNums2(){
        int[] actual={19, 2, 14, 55, 8};
        int[] expected={2, 8, 14, 19, 55};
        assertArrayEquals( expected,sortArrayUpward.sortUpward( actual));
    }

}