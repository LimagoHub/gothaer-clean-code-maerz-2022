package de.gothaer;

import java.util.ArrayList;
import java.util.List;

public class AttributedCharater {

    private static final List<AttributedCharater> characters = new ArrayList<>();

    private final char c;
    private final boolean bold;

    private AttributedCharater(char c, boolean bold) {
        this.c = c;
        this.bold = bold;
        characters.add(this);
    }

    public static AttributedCharater getInstance(char c, boolean bold) {
        for (AttributedCharater character: characters) {
            if(c == character.c && bold == character.bold) return character;
        }
        return new AttributedCharater(c,bold);
    }

    public char getC() {
        return c;
    }

    public boolean isBold() {
        return bold;
    }
}
