/**
 * Created by Louis on 6/17/2015.
 */
public class Card {
    private String number;
    private String suit;

    public Card(Integer number,Integer suit)
    {
        switch(number)
        {
            case 11:
                this.number = "J";
                break;
            case 12:
                this.number = "Q";
                break;
            case 13:
                this.number = "K";
                break;
            case 1:
                this.number = "A";
                break;
            default:
                this.number = number.toString();
        };

        if(suit == 1)
        {
            this.suit = "Diamond";
        }
        else if(suit == 2)
        {
            this.suit = "Clubs";
        }
        else if(suit == 3)
        {
            this.suit = "Hearts";
        }
        else if(suit == 4)
        {
            this.suit = "Spades";
        }

    }


    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
