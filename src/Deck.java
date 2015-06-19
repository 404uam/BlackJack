import java.util.Random;
import java.util.Stack;

/**
 * Created by Louis on 6/17/2015.
 */
public class Deck {

    private Stack <Card> deck = new <Card> Stack();
    private int DECK_SIZE = 52;
    private int SUIT_SIZE = 13;
    private int SUITS     = 4;


    public Deck()
    {

        for(int j = 0; j < 1; j++) {
            for (int i = 1; i <= SUITS; i++) {
                for (int c = 1; c <= SUIT_SIZE; c++) {
                    Card temp = new Card(c, i);
                    deck.add(temp);
                }
            }
        }

    }

    public Card drawCard()
    {
        return deck.pop();
    }

    public void shuffleDeck()
    {
        Random rn = new Random();
        for(int i = deck.size(); i > 0 ; i--)
        {
            Card temp = deck.pop();
            deck.add(rn.nextInt(deck.size()),temp);
        }
    }

    public void restockDeck()
    {

    }

    public int getSize()
    {
        return deck.size();
    }


}
