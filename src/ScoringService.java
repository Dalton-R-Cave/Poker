import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by dalton on 9/18/16.
 */
public class ScoringService {

    public int scorePlayer(ArrayList<Card> cards){
        boolean royaLFlush = checkForRoyalFlush(cards);
        boolean straightFlush = checkForStraightFlush();

        return 0;
    }

    private boolean checkForRoyalFlush(ArrayList<Card> cards){
        boolean royalFlush = true;
        ArrayList<Card> royalCards = getAllRoyalCards(cards);

        royalFlush = royalFlush && isRoyal(royalCards);
        royalFlush = royalFlush && isFlush(royalCards);

        return royalFlush;
    }

    private boolean checkForStraightFlush(){
        return false;
    }

    private ArrayList<Card> getAllRoyalCards(ArrayList<Card> cards){
        return cards;
    }

    private boolean isRoyal(ArrayList<Card> cards){
        boolean[] eachRoyal = new boolean[5];
        Arrays.fill(eachRoyal, false);

        for(int i = 0; i < cards.size(); i++){
            switch(cards.get(i).getRank()){
                case 10: eachRoyal[0] = true;
                    break;
                case 11: eachRoyal[1] = true;
                    break;
                case 12: eachRoyal[2] = true;
                    break;
                case 13: eachRoyal[3] = true;
                    break;
                case 14: eachRoyal[4] = true;
                    break;
            }
        }

        return !arrayContainsBoolean(eachRoyal, false);
    }

    private boolean isFlush(ArrayList<Card> cards){
        return true;
    }

    private boolean arrayContainsBoolean(boolean[] boolArray, boolean tOrf){
        boolean contains = false;
        for(int i = 0; i < boolArray.length; i++){
            if(boolArray[i] == tOrf){
                contains = true;
                break;
            }
        }

        return contains;
    }
}
