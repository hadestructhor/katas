package org.example;

public class RomanNumerals {
    public static String fromDecimal(int i) {
        return RomanLetter.I.getRepresentation().repeat(i);
    }
}
