public class Main {
    public static void main(String[] args) {
        int card = (int) (Math.random() * 13 + 1);
        int suit = (int) (Math.random() * 4 + 1);

        String cardName;
        String suitName;

        if (card == 1)
        cardName = "Ace";

        else if (card == 2)
        cardName = "two";

        else if (card == 3)
        cardName = "three";

        else if (card == 4)
        cardName = "four";

        else if (card == 5)
        cardName = "five";

        else if (card == 6)
        cardName = "six";

        else if (card == 7)
        cardName = "seven";

        else if (card == 8)
        cardName = "eight";

         else if (card == 9)
        cardName = "nine";

        else if (card == 10)
        cardName = "ten";

        else if (card == 11)
        cardName = "knight";

        else if (card == 12)
            cardName = "queen";

        else
            cardName = "king";

        if (suit == 1)
            suitName = "Spades";

        else if (suit == 2)
            suitName = "Hearts";

        else if (suit == 3)
            suitName = "Clover";

        else
            suitName = "Diamonds";

        System.out.println("you got " + cardName + " of " + suitName);
    }
}
