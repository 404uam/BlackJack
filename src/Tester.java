/**
 * Created by Louis on 6/17/2015.
 */
public class Tester {

    public static void main(String[] args0)
    {
        printMenu();
        Deck deck = new Deck();
        Card temp;
        Card temp2;
        Card temp3;

        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();

        /*
        for(int i = deck.getSize(); i > 0;i--){
        temp = deck.drawCard();
        System.out.println(temp.getNumber() + " " + temp.getSuit());
        }
        */

        temp = deck.drawCard();
        System.out.println(temp.getNumber() + " " + temp.getSuit()+"\n");

        temp2 = deck.drawCard();
        System.out.println(temp2.getNumber() + " " + temp2.getSuit()+"\n");

        temp3 = deck.drawCard();
        System.out.println(temp3.getNumber() + " " + temp3.getSuit()+"\n");

        deck.restockDeck();
        System.out.print(deck.contains(temp));
        System.out.print(deck.contains(temp2));
        System.out.print(deck.contains(temp3));



    }

    public static void printMenu()
    {
        System.out.println("******** MENU ********\n"+
                           "1.      SHUFFLE       \n"+
                           "2.       DEAL         \n"+
                           "**********************");
    }

}
