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

    @Test
    void shouldReturnIXfor9() {
        String expected = "IX";
        String actual = RomanNumerals.fromDecimal(9);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnXfor10() {
        String expected = "X";
        String actual = RomanNumerals.fromDecimal(10);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnXIIIfor13() {
        String expected = "XIII";
        String actual = RomanNumerals.fromDecimal(13);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnXIVfor14() {
        String expected = "XIV";
        String actual = RomanNumerals.fromDecimal(14);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnXVIIIfor18() {
        String expected = "XVIII";
        String actual = RomanNumerals.fromDecimal(18);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnXIXfor19() {
        String expected = "XIX";
        String actual = RomanNumerals.fromDecimal(19);
        assertEquals(expected, actual);
    }
}
