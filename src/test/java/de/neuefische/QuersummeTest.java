package de.neuefische;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class QuersummeTest {
    @ParameterizedTest
    @CsvSource({"7,7","23,5", "323,8", "2361,12"})
    void returnQuerSummeWhenGivenNums(int actual,int expected){
        assertEquals( expected,Quersumme.calculateQuersumme(actual));
    }

    @ParameterizedTest
    @CsvSource({"0,1","5,1","23,2", "323,3", "2361,4"})
    void returnDigitsWhenGivenNums(int actual,int expected){
        assertEquals( expected,Quersumme.countDigits(actual));
    }




}