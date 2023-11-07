package org.example;

public class PartyShoes implements Shoes {
    public boolean match(Shoes other) {
        return other instanceof PartyShoes;
    }
}
