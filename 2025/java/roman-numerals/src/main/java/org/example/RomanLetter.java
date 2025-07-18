package org.example;

public enum RomanLetter {
    I("I"),
    V("V")
    ;
    private final String representation;

    RomanLetter(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }
}
