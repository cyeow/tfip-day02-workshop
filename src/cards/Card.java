package cards;

public class Card {
    private final Suit suit;
    private final CardValue value;

    public Suit getSuit() {
        return suit;
    }

    public CardValue getValue() {
        return value;
    }

    public Card(Suit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString() + " of " + suit.toString();
    }
}

