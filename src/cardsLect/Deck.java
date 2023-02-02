package cardsLect;

import java.util.Collections;
import java.util.LinkedList;

public class Deck {

    public String[] SUIT = {"Club", "Diamond", "Heart", "Spade"};
    public String[] NAME = {"Ace", "2", "3", "4", "5",
                             "6", "7", "8", "9", "10",
                             "Jack", "Queen", "King"};
    public int[] RANK = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    private LinkedList<Card> cards = new LinkedList<>();

    // private Card[] cards = new Card[52];
    
    public Deck() {
        for(int s = 0; s < SUIT.length; s++) {
            for(int n = 0; n < NAME.length; n++) {
                Card c = new Card(SUIT[s], NAME[n],RANK[n]);
                System.out.println(c);
                //cards[(s*NAME.length)+n] = c;
                cards.add(c);
            }
        }

        for(int s = 0; s < cards.size(); s++) {
            System.out.printf("> %s\n", cards.get(s));
        }
        System.out.printf("Number of cards in deck: %d", cards.size());
    }

    public Card take() {
        return cards.remove();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
    // public Deck() {
    //     int s = 0;

    //     while(s < SUIT.length) {
    //         int j = 0;
    //         while(j < NAME.length) {
    //             Card c = new Card(SUIT[s], NAME[j], RANK[j]);
    //             System.out.printf(">> card: %s\n",c);
    //             j++;
    //         }
    //         s++;
    //     }
    // }
}
