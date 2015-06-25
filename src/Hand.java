import java.util.LinkedList;

/**
 * Created by Louis on 6/17/2015.
 */
public class Hand {
    LinkedList <Card> hand = new LinkedList<Card>();
    Deck deck = Deck.getInstance();
    private int value;


    public Hand()
    {
        value = 0;
    }

    public boolean hit()
    {
        Card newCard = deck.drawCard();
        boolean bust = false;

        computeValue();

        if(value > 21 && checkAce())
        {

        }


        return bust;
    }

    private int convertCard(Card e)
    {
        int value;

        if(e.getNumber().equals("J")||e.getNumber().equals("Q")||e.getNumber().equals("K"))
        {
            value = 10;
        }
        else if(e.getNumber().equals("A"))
        {
            value = 11;
        }
        else
            value = e.getNumber().charAt(0);


        return value;
    }

    private boolean checkAce()
    {
        boolean hasAce = false;
        Card AceOfSpades = new Card(1,4);
        Card AceOfHearts = new Card(1,3);
        Card AceOfClubs = new Card(1,2);
        Card AceOfDiamonds = new Card(1,1);

        //if(hand.contains(I CANT THINK))
        return hasAce;
    }

    private void computeValue()
    {
        for(int i = 0; i < hand.size(); i++)
        {
            value += convertCard(hand.get(i));
        }

    }

    private void computeValue(boolean args)
    {
        for(int i = 0; i < hand.size(); i++)
        {
            value += convertCard(hand.get(i));
        }

    }

    // This is to test the global instance of the deck. Should be working as of 6/19/15
    public void testInstance()
    {
        Card temp = deck.drawCard();

        System.out.println(temp.getNumber() + " " + temp.getSuit());
    }




}
