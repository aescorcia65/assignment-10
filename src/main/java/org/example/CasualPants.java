package org.example;

public class CasualPants implements Pants {
    public boolean match(Pants other) {
        return other instanceof CasualPants;
    }
}
