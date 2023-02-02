package cards;

import java.util.Random;

public enum Suit {
    DIAMONDS,
    CLUBS,
    HEARTS,
    SPADES;

    @Override
    public String toString() {
        return switch(this) {
            case DIAMONDS -> "diamonds";
            case CLUBS -> "clubs";
            case HEARTS -> "hearts";
            case SPADES -> "spades";
        };
    }

    public static final Random rng = new Random();

    public static Suit randomSuit() {
        return values()[rng.nextInt(values().length)];
    }
}
