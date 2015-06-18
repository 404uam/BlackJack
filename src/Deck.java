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
        for(int i = 1; i <= SUITS; i++) {
            for (int c = 1; c <= SUIT_SIZE; c++) {
                Card temp = new Card(c,i);
                deck.add(temp);
            }
        }
        for(int i1 = 1; i1 <= SUITS; i1++) {
            for (int c1 = 1; c1 <= SUIT_SIZE; c1++) {
                Card temp = new Card(c1,i1);
                deck.add(temp);
            }
        }
        for(int i2 = 1; i2 <= SUITS; i2++) {
            for (int c2 = 1; c2 <= SUIT_SIZE; c2++) {
                Card temp = new Card(c2,i2);
                deck.add(temp);
            }
        }
        for(int i3 = 1; i3 <= SUITS; i3++) {
            for (int c3 = 1; c3 <= SUIT_SIZE; c3++) {
                Card temp = new Card(c3,i3);
                deck.add(temp);
            }
        }
        for(int i4 = 1; i4 <= SUITS; i4++) {
            for (int c4 = 1; c4 <= SUIT_SIZE; c4++) {
                Card temp = new Card(c4,i4);
                deck.add(temp);
            }
        }
        for(int i5 = 1; i5 <= SUITS; i5++) {
            for (int c5 = 1; c5 <= SUIT_SIZE; c5++) {
                Card temp = new Card(c5,i5);
                deck.add(temp);
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
