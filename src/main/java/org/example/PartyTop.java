package org.example;

public class PartyTop implements Top {
    public boolean match(Top other) {
        return other instanceof PartyTop;
    }
}
