package org.example;

public class RomanNumerals {
    public static String fromDecimal(int number) {
        if(number <= 3) {
            return RomanLetter.I.getRepresentation().repeat(number);
        }
        if(number == 4) {
            return RomanLetter.I.getRepresentation() + RomanLetter.V.getRepresentation();
        }
        if(number < 9) {
            return RomanLetter.V.getRepresentation() + RomanLetter.I.getRepresentation().repeat(number - RomanLetter.V.getNumberRepresentation());
        }
        return null;
    }
}
