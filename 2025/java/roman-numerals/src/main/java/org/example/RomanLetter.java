package org.example;

public enum RomanLetter {
    I("I", 3),
    V("V", 5),
    X("X", 10)
    ;
    private final String representation;
    private final int numberRepresentation;

    public int getNumberRepresentation() {
        return numberRepresentation;
    }

    RomanLetter(String representation, int numberRepresentation) {
        this.representation = representation;
        this.numberRepresentation = numberRepresentation;
    }

    public String getRepresentation() {
        return representation;
    }
}
