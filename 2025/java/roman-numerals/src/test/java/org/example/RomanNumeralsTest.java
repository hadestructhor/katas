package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

    @Test
    void shouldReturnIfor1() {
        String expected = "I";
        String actual = RomanNumerals.fromDecimal(1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnIIIfor3() {
        String expected = "III";
        String actual = RomanNumerals.fromDecimal(3);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnIVfor4() {
        String expected = "IV";
        String actual = RomanNumerals.fromDecimal(4);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnVfor5() {
        String expected = "V";
        String actual = RomanNumerals.fromDecimal(5);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnVIIIfor8() {
        String expected = "VIII";
        String actual = RomanNumerals.fromDecimal(8);
        assertEquals(expected, actual);
    }
}
