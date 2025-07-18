package org.example;

public class RomanNumerals {
    public static String fromDecimal(int number) {
        int singleDigit = number % 10;
        int doubleDigits = number / 10;
        return getDoubleDigitsRepresentation(doubleDigits) +
                getSingleDigitRepresentation(singleDigit);
    }

    private static String getDoubleDigitsRepresentation(int number) {
        if(number == 0) {
            return "";
        }
        return RomanLetter.X.getRepresentation();
    }

    private static String getSingleDigitRepresentation(int number) {
        if(number <= 3) {
            return RomanLetter.I.getRepresentation().repeat(number);
        }
        if(number == 4) {
            return RomanLetter.I.getRepresentation() + RomanLetter.V.getRepresentation();
        }
        if(number < 9) {
            return RomanLetter.V.getRepresentation() + RomanLetter.I.getRepresentation().repeat(number - RomanLetter.V.getNumberRepresentation());
        }
        return RomanLetter.I.getRepresentation() + RomanLetter.X.getRepresentation();
    }
}
