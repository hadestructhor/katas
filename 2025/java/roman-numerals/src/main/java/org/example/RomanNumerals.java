package org.example;

public class RomanNumerals {
    public static String fromDecimal(int number) {
        if(number == 4) {
            return RomanLetter.I.getRepresentation() + RomanLetter.V.getRepresentation();
        }
        if(number == 5) {
            return RomanLetter.V.getRepresentation();
        }
        return RomanLetter.I.getRepresentation().repeat(number);
    }
}
