package org.example;

public class PartyGarment implements GarmentSim{
    public Top createTop() {
        return new PartyTop();
    }

    public Pants createPants() {
        return new PartyPants();
    }

    public Shoes createShoes() {
        return new PartyShoes();
    }
}
