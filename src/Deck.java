import java.util.Random;
import java.util.Stack;

/**
 * Created by Louis on 6/17/2015.
 */
public class Deck {

    private Stack <Card> deck = new <Card> Stack();
    private Stack <Card> inPlay = new <Card> Stack();
    private static Deck instance = null;
    private int DECK_SIZE = 52;
    private int SUIT_SIZE = 13;
    private int SUITS     = 4;
    private int NUM_OF_DECKS = 6;


    public Deck()
    {
        for(int j = 0; j < NUM_OF_DECKS; j++) {
            for (int i = 1; i <= SUITS; i++) {
                for (int c = 1; c <= SUIT_SIZE; c++) {
                    Card temp = new Card(c, i);
                    deck.add(temp);
                }
            }
        }

    }

    public static Deck getInstance(){
        if(instance == null){
            instance = new Deck();
        }
        return instance;
    }

    public Card drawCard()
    {
        Card temp = deck.pop();
        inPlay.add(temp);             //Why am i burning the card right as I draw.. Good idea or no?
        return temp;
    }

    /**
     * @name shuffleDeck
     * @author Louis
     *
     * Takes a random number and for every card in the deck stack it will be added in a random location in the stack
     * it is recommended that this is done more than once to ensure randomness .
     */
    public void shuffleDeck()
    {
        Random rn = new Random();
        for(int i = deck.size(); i > 0 ; i--)
        {
            Card temp = deck.pop();
            deck.add(rn.nextInt(deck.size()),temp);
        }
    }

    /**
     * @name restockDeck
     * @author Louis
     * Takes all the cards in the stack which is the inPlay pile and adds them back to the main deck
     * Then shuffles main deck
     *
     */
    public void restockDeck()
    {
        for(int i = inPlay.size(); i > 0; i--)
        {
            deck.add(inPlay.pop());
        }
        shuffleDeck();
        shuffleDeck();
        shuffleDeck();
        shuffleDeck();
    }

    // This function is for debugging / testing
    public int getSize()
    {
        return deck.size();
    }

    // This function is for debugging / testing
    public boolean contains(Card e)
    {
        return deck.contains(e);
    }

    // This function is for debugging / testing @TODO REMOVE FOR FINAL PRODUCT
    public Card peek()
    {
        return deck.peek();
    }
}
