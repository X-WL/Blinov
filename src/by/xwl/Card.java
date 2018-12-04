package by.xwl;

/**
 * This class (@code Card) implementation base function of banks card.
 *
 * @author X-WL
 * @see by.xwl
 */
public class Card {
    /*This field (@code cardNumber) is 4th-field bank card number.*/
    private int[] cardNumber;
    private double debit;
    private double credit;

    /**
     * This constructor use (@code int) array
     * for set (@codeNumber) and two double field.
     *
     * @param cardNumber is (@code int) array
     * @param debit      is (@code double)
     * @param credit     is (@code double)
     */
    public Card(int[] cardNumber, double debit, double credit) {
        this.cardNumber = cardNumber;
        this.debit = debit;
        this.credit = credit;
    }

    public void setCardNumber(int[] cardNumber) {
        this.cardNumber = cardNumber;
    }


    public void setCardNumber(String cardNumber) {
        String[] str = cardNumber.split(" ");
        int[] number = new int[4];
        for (int i = 0; i < 4; i++) {
            number[i] = Integer.valueOf(str[i]);
        }
        this.cardNumber = number;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public int[] getCardNumber() {
        return cardNumber;
    }

    public String getCardNumberStr() {
        String output = String.format("%1$d %2$d %3$d %4$d",
                cardNumber[0], cardNumber[1], cardNumber[2], cardNumber[3]);
        return output;
    }

    public double getDebit() {
        return debit;
    }

    public double getCredit() {
        return credit;
    }

    /**
     * This method printed full information this class.
     *
     * @author X-WL
     * @see #print()
     * @see by.xwl
     */
    public void print() {
        System.out.println("Card number: " + getCardNumberStr());
        System.out.println("Debit: " + getDebit());
        System.out.println("Credit: " + getCredit());
    }
}
