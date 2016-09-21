
/**
 * Created by dalton on 9/17/16.
 */
public class Card implements Comparable<Card>{
    int rank;
    Enums.Suit suit;


    public Card(int rank, Enums.Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank(){
        return rank;
    }

    public void setRank(int rank){
        this.rank = rank;
    }

    public Enums.Suit getSuit(){
        return suit;
    }

    public void setSuit(Enums.Suit suit){
        this.suit = suit;
    }

    @Override
    public String toString(){
        String rankString = "";
        if(rank < 11){
            rankString = rank + "";
        }
        else{
            switch(rank){
                case 11: rankString = "Jack";
                    break;
                case 12: rankString = "Queen";
                    break;
                case 13: rankString = "King";
                    break;
                case 14: rankString = "Ace";
                    break;
            }
        }
        return rankString + " of " + suit;
    }

    public int compareTo(Card compareCard){
        int compareRank = compareCard.getRank();

        return this.rank - compareRank;
    }
}


