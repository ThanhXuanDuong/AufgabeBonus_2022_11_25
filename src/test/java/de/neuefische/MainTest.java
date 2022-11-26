package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void OneDigitNum_WhenEinsThen1() {
        assertEquals(1,Main.stringToOneDigitNum("Eins"));
    }
    @Test
    public void OneDigitNum_WhenZweiThen2() {
        assertEquals(2,Main.stringToOneDigitNum("Zwei"));
    }
    @Test
    public void OneDigitNum_WhenDreiThen3() {
        assertEquals(3,Main.stringToOneDigitNum("Drei"));
    }
    @Test
    public void OneDigitNum_WhenNeunThen9() {
        assertEquals(9,Main.stringToOneDigitNum("Neun"));
    }

    @Test
    public void OneDigitNum_WhenZehnThen0() {
        assertEquals(0,Main.stringToOneDigitNum("Zehn"));
    }

    @Test
    public void printInput_PrintHelloWhenHello() {
        String[] words=new String[]{"Hello"};
        assertEquals("Hello",Main.printInput(words));
    }

    @Test
    public void printInput_PrintHelloWorldWhenHelloWorld() {
        String[] words=new String[]{"Hello","World"};
        assertEquals("Hello World",Main.printInput(words));
    }

    @Test
    public void printInput_PrintHelloWorldHalloWeltWhenHelloWorldHalloWelt() {
        String[] words=new String[]{"Hello World","Hallo Welt"};
        assertEquals("Hello World Hallo Welt",Main.printInput(words));
    }


}