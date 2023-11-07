package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        GarmentSim factory = new ProfessionalGarment();
        Top top = factory.createTop();
        Pants pants = factory.createPants();
        Shoes shoes = factory.createShoes();

        if (top.match(top) && pants.match(pants) && shoes.match(shoes)) {
            List<Object> outfit = new ArrayList<>();
            outfit.add(top);
            outfit.add(pants);
            outfit.add(shoes);
            System.out.println("Matching outfit:");
            for (Object garment : outfit) {
                System.out.println(garment);
            }
        } else {
            System.out.println("No matching outfit found.");
        }
        // Press Ctrl+Shift+Enter to complete a statement automatically.

        }
    }