import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Louis on 6/17/2015.
 */
public class Hand {
    Queue <Card> hand = new LinkedList<>();
    Deck deck = Deck.getInstance();
    private int value;


    public Hand()
    {
        value = 0;
    }

    public boolean hit()
    {
        boolean bust = false;
        deck.drawCard();


        return bust;
    }

    public void testInstance()
    {
        Card temp = deck.drawCard();

        System.out.println(temp.getNumber() + " " + temp.getSuit());
    }




}
