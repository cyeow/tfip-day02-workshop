package cards;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println(deck);
        deck.draw();
        deck.shuffle();
        System.out.println(deck);
        deck.draw(2);
        System.out.println(deck);
    }
    
}
