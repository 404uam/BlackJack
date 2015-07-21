import java.util.LinkedList;

/**
 * Created by Louis on 6/17/2015.
 */
public class Tester {

    public static void main(String[] args0)
    {
        printMenu();
        Deck deck = Deck.getInstance();

        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();


        Hand hand = new Hand();
        Hand hand2 = new Hand();
        Hand hand3 = new Hand();
        Card temp = null;
        Card temp2 = null;
        Card temp3 = null;

        hand.getStartCard();
        hand2.getStartCard();
        hand3.getStartCard();

        testHand(hand);
        testHand(hand2);
        testHand(hand3);



        //testInstance(temp,deck,hand);
       //printCardsAfterShuffle(deck,temp);
    }

    public static void printMenu()
    {
        System.out.println("******** MENU ********\n" +
                           "1.      SHUFFLE       \n" +
                           "2.       DEAL         \n" +
                           "**********************");
    }

    public static void testInstance(Card temp,Deck deck,Hand hand)
    {
        temp = deck.drawCard();
        System.out.println(temp.getNumber() + " " + temp.getSuit());

        deck.shuffleDeck();
        temp = deck.peek();
        System.out.println(temp.getNumber() + " " + temp.getSuit());

        hand.testInstance();;

    }

    public static void printCardsAfterShuffle(Deck deck, Card temp)
    {

        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();


        for(int i = deck.getSize(); i > 0;i--){
        temp = deck.drawCard();
        System.out.println(temp.getNumber() + " " + temp.getSuit());
        }

    }

    public static void testRestock(Deck deck, Card temp)
    {

        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();


        for(int i = deck.getSize(); i > 0;i--){
        temp = deck.drawCard();
        System.out.println(temp.getNumber() + " " + temp.getSuit());
        }

    }

    public static void testHand(Hand hand)
    {
        LinkedList<Card> cards = hand.getHand();

        System.out.println(hand.getValue());
        for(int i = 0; i < cards.size(); i ++)
        {
            System.out.print(" " + cards.get(i));
        }
        System.out.println();
    }
}

