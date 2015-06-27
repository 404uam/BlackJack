import java.util.LinkedList;

/**
 * Created by Louis on 6/17/2015.
 */
public class Hand {
    LinkedList <Card> hand = new LinkedList<Card>();
    Deck deck = Deck.getInstance();
    private int value;
    private Card AceOfSpades = new Card(1,4);
    private Card AceOfHearts = new Card(1,3);
    private Card AceOfClubs = new Card(1,2);
    private Card AceOfDiamonds = new Card(1,1);


    public Hand()
    {
        value = 0;
        getStartCard();
    }

    public boolean hit()
    {
        Card newCard = deck.drawCard();
        boolean bust = false;

        computeValue();

        if(value > 21 && checkAce())
        {
            computeValue(true);
        }

        if(value > 21)
        {
            bust = true;
        }

        return bust;
    }

    public void getStartCard()
    {
        hand.add(deck.drawCard());
    }
    public int getValue()
    {
        return value;
    }

    public LinkedList getHand()
    {
        return hand;
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

        for(int c = hand.size()-1; c >= 0; c--)
        {
            Card temp = null; //Card to be looked at in the hand
            temp = hand.get(c);
            if(temp.getNumber().equals("A")&&temp.getSuit().equals("Clubs"))
            {
                System.out.println("Ace of Clubs found");
                hasAce = true;
                break;
            }
            else if(temp.getNumber().equals("A")&&temp.getSuit().equals("Diamonds"))
            {
                System.out.println("Ace of Diamonds found");
                hasAce = true;
                break;
            }
            else if(temp.getNumber().equals("A")&&temp.getSuit().equals("Hearts"))
            {
                System.out.println("Ace of Hearts found");
                hasAce = true;
                break;
            }
            else if(temp.getNumber().equals("A")&&temp.getSuit().equals("Spades"))
            {
                System.out.println("Ace of Spades found");
                hasAce = true;
                break;
            }
        }
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
        if(args) //Aces value are changed to 1 from 11
        {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getNumber().equals("A")) {
                    value = +1;
                } else
                    value += convertCard(hand.get(i));
            }
        }
    }

    /*****************
     *
     * START OF DEBUGGING METHODS/FUNCTIONS
     *
     *
     ********************/
    // This is to test the global instance of the deck. Should be working as of 6/19/15
    public void testInstance()
    {
        Card temp = deck.drawCard();

        System.out.println(temp.getNumber() + " " + temp.getSuit());
    }




}
