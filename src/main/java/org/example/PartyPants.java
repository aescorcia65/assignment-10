package org.example;

public class PartyPants implements Pants {
    public boolean match(Pants other) {
        return other instanceof PartyPants;
    }
}
