package source;

public class CoinBundle {
    public int number1PennyCoins;
    public int number5NickelCoins;
    public int number10DimeCoins;
    public int number25QuarterCoins;
    public CoinBundle(int... enteredCoins) {
        this.number1PennyCoins = enteredCoins[0];
        this.number5NickelCoins = enteredCoins[1];
        this.number10DimeCoins = enteredCoins[2];
        this.number25QuarterCoins = enteredCoins[3];

    }


    public int getTotal(){
        int total = 0;
        total = total+this.number1PennyCoins* Coin.PENNY.getValue();
        total = total+this.number5NickelCoins* Coin.NICKEL.getValue();
        total = total+this.number10DimeCoins* Coin.DIME.getValue();
        total = total+this.number25QuarterCoins* Coin.QUARTER.getValue();
        return total;
    }
}
