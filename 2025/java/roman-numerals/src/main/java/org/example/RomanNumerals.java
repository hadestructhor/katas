package org.example;

public class RomanNumerals {
    public static String fromDecimal(int number) {
        return RomanLetter.I.getRepresentation().repeat(number);
    }
}
