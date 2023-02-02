package cardsLect;

public class Card {
    
    private String suit;
    private String name;
    private int rank;

    public String getSuit() {
        return suit;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public Card(String suit, String name, int rank) {
        this.suit = suit;
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{suit=%s, name=%s, rank=%s}"
                .formatted(this.suit,this.name,this.rank);
    }
}
