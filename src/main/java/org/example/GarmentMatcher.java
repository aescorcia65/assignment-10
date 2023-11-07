package org.example;

import java.util.ArrayList;
import java.util.List;

public class GarmentMatcher {
    public static List<Object> createMatchingOutfit(GarmentSim factory) {
        Top top = factory.createTop();
        Pants pants = factory.createPants();
        Shoes shoes = factory.createShoes();

        if (top.match(top) && pants.match(pants) && shoes.match(shoes)) {
            List<Object> outfit = new ArrayList<>();
            outfit.add(top);
            outfit.add(pants);
            outfit.add(shoes);
            return outfit;
        } else {
            return null;
        }
    }
}

