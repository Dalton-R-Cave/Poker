import java.util.Comparator;

/**
 * Created by dalton on 9/18/16.
 */
public class CardComparator implements Comparator<Card>{
    public int compare(Card card1, Card card2) {
        return card1.compareTo(card2);
    }
}