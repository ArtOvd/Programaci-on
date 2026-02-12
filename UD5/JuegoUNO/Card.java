package JuegoUNO;

import java.util.ArrayList;

public class Card {
    private CardColor color;
    private int value;
    private CardType type;

    public Card(CardColor color, int value, CardType type) {
        setColor(color);
        setValue(value);
        setType(type);
    }

    public CardColor getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }

    public CardType getType() {
        return type;
    }

    public void setColor(CardColor color) {
        this.color = color;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public String printCard() {
        String val;
        if (value == -1) {
            val = "*";
        } else {
            val = String.valueOf(value);
        }
        String line1 = String.format("%-8s", val);
        String line2 = String.format("%-9s", color);
        String line3 = String.format("%-9s", type);

        return "┌─────────┐\n" +
                "│ " + line1 + "│\n" +
                "│" + line2 + "│\n" +
                "│" + line3 + "│\n" +
                "└─────────┘";
    }

}
