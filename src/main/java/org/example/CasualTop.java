package org.example;

public class CasualTop implements Top {
    public boolean match(Top other) {
        return other instanceof CasualTop;
    }
}
