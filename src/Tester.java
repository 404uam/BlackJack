/**
 * Created by Louis on 6/17/2015.
 */
public class Tester {

    public static void main(String[] args0)
    {
        printMenu();
        Deck deck = Deck.getInstance();
        Hand hand = new Hand();
        Card temp;
        Card temp2;
        Card temp3;



    }

    public static void printMenu()
    {
        System.out.println("******** MENU ********\n"+
                           "1.      SHUFFLE       \n"+
                           "2.       DEAL         \n"+
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
}

