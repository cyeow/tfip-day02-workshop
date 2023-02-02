package cards;

import java.util.Random;

public enum CardValue {
    ACE("ace",1),
    TWO("2",2),
    THREE("3",3),
    FOUR("4",4),
    FIVE("5",5),
    SIX("6",6),
    SEVEN("7",7),
    EIGHT("8",8),
    NINE("9",9),
    TEN("10",10),
    JACK("jack",10),
    QUEEN("queen",10),
    KING("king",10);
    
    private String strValue;
    private int numValue;

    private CardValue(String strValue, int numValue) {
        this.strValue = strValue;
        this.numValue = numValue;
    }

    @Override
    public String toString() {
        return strValue;
    }

    public static final Random rng = new Random();

    public static CardValue randomCardValue() {
        return values()[rng.nextInt(values().length)];
    }

}
