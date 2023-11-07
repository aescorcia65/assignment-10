package org.example;

public class ProfessionalPants implements Pants {
    public boolean match(Pants other) {
        return other instanceof ProfessionalPants;
    }
}
