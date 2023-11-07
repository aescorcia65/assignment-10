package org.example;

public class ProfessionalGarment implements GarmentSim {
    public Top createTop() {
        return new ProfessionalTop();
    }

    public Pants createPants() {
        return new ProfessionalPants();
    }

    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
