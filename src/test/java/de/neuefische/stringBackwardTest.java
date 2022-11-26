package de.neuefische;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class stringBackwardTest {
    @ParameterizedTest
    @CsvSource({"CBA,ABC", "1234,4321", "ABCDEFG,GFEDCBA"})
    void returnExpectedBackwardStringWhenGivenString(String input,String expected){
        assertEquals(expected,stringBackward.flipString(input));
    }

}