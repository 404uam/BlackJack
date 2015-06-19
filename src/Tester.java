/**
 * Created by Louis on 6/17/2015.
 */
public class Tester {

    public static void main(String[] args0)
    {
        printMenu();
        Deck deck = new Deck();
        Card temp;
        /*
        for(int i = 0; i<52;i++){
            temp = deck.drawCard();
            System.out.println(temp.getNumber() + " " + temp.getSuit());
        }
*/
        temp = deck.drawCard();
        System.out.println(temp.getNumber() + " " + temp.getSuit()+"\n");

        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();

        for(int i = deck.getSize(); i > 0;i--){
            temp = deck.drawCard();
            System.out.println(temp.getNumber() + " " + temp.getSuit());
        }


    }

    public static void printMenu()
    {
        System.out.println("******** MENU ********\n"+
                           "1.      SHUFFLE       \n"+
                           "2.       DEAL         \n"+
                           "**********************");
    }

}
