package cards;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    
    private Stack<Card> cards = new Stack<>();
    
    // constructor 
    public Deck() {
        // generates all 52
        for(Suit s : Suit.values()) {
            for(CardValue cv : CardValue.values()) {
                Card c = new Card(s, cv);
                cards.push(c);
            }
        }
    }
    
    public Deck(int numCards) {
        this(numCards,false);
    }

    public Deck(int numCards, boolean duplicatesAllowed) {
        // create numCards number of cards and add to deck
        // check if there are duplicates;

        // i wrote this below to allow for cards to be generated in a random order
        
        for(int i = 0; i < numCards; i++) {
            Card c = new Card(Suit.randomSuit(), CardValue.randomCardValue());
            if(!duplicatesAllowed) {
                if(cards.toString().contains(c.toString())) {
                    i--;
                } else {
                    cards.push(c);
                }
            } else {
                cards.push(c);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        Card c = cards.pop();
        System.out.println("Card drawn: " + c);
        return c;
    }

    public List<Card> draw(int numCards) {
        // loop draw()
        if(numCards > cards.size()) {
            System.out.println("That's more cards than what's left in the stack!");
            return null;
        }

        List<Card> result = new ArrayList<>();
        
        for(int i = 0; i < numCards; i++) {
            result.add(draw());
        }
        return result;
    }

    public static void print(List<Card> list) {

    }

    @Override
    public String toString() {
        String result = "Number of cards in deck: " + cards.size() + "\n";
        
        int i = 1;
        for(Card card : cards) {
            result = result + i + ") " + card.toString() + "\n";
            i++;
        }
        
        return result;
    }

}
