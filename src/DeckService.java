import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dalton on 9/18/16.
 */
public class DeckService {
    private static final int MIN_ITERATIONS = 500;
    private static final int MAX_ITERATIONS = 1000;

    private int currentCardToDeal = 0;

    ArrayList<Card> deck;

    public void generate52CardDeck(){
        ArrayList<Card> deck52 = new ArrayList<>();

        for(int i = 2; i < 15; i++){
            deck52.add(new Card(i, Enums.Suit.hearts));
            deck52.add(new Card(i, Enums.Suit.diamonds));
            deck52.add(new Card(i, Enums.Suit.clubs));
            deck52.add(new Card(i, Enums.Suit.spades));
        }

        deck = deck52;
    }

    public void shuffleDeck(){
        currentCardToDeal = 0;
        Random generator = new Random();
        int iterations = generator.nextInt(MAX_ITERATIONS - MIN_ITERATIONS) + MIN_ITERATIONS;

        for(int index = 0; index < iterations; index++) {
            int i = generator.nextInt(52);
            int j = i;
            while (j == i) {
                j = generator.nextInt(52);
            }

            swapCards(i, j);
        }
    }

    public void swapCards(int index1, int index2){
        Card temp = deck.get(index1);
        deck.set(index1, deck.get(index2));
        deck.set(index2, temp);
    }

    public ArrayList<Card> deal(int numCards){
        ArrayList<Card> hand = new ArrayList<>();
        for(int i = 0; i < numCards; i++){
            hand.add(deck.get(currentCardToDeal++));
        }

        return hand;
    }

    public static ArrayList<Card> combineHands(ArrayList<Card> hand1, ArrayList<Card> hand2){
        ArrayList<Card> cards = new ArrayList<>();
        for(int i = 0; i < hand1.size(); i++){
            cards.add(hand1.get(i));
        }
        for(int i = 0; i < hand2.size(); i++){
            cards.add(hand2.get(i));
        }

        return cards;
    }

    public ArrayList<Card> getDeck(){
        return deck;
    }
}
