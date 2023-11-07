package org.example;

public class ProfessionalTop implements Top {
    public boolean match(Top other) {
        return other instanceof ProfessionalTop;
    }
}
