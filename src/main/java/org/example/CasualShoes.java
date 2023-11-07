package org.example;

public class CasualShoes implements Shoes {
    public boolean match(Shoes other) {
        return other instanceof CasualShoes;
    }
}
