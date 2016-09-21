import java.util.ArrayList;

/**
 * Created by dalton on 9/18/16.
 */
public class Poker {

    public static void main(String[] args){
        DeckService deckService = new DeckService();
        ScoringService scoringService = new ScoringService();

        deckService.generate52CardDeck();

        deckService.shuffleDeck();

        ArrayList<Card> playerHand = deckService.deal(2);
        ArrayList<Card> dealerHand = deckService.deal(5);

        int playerScore = scoringService.scorePlayer(DeckService.combineHands(playerHand, dealerHand));
    }
}