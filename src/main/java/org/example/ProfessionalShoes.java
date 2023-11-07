package org.example;

public class ProfessionalShoes implements Shoes {
    public boolean match(Shoes other) {
        return other instanceof ProfessionalShoes;
    }
}
