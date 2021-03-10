package source;

public class SimpleCalculator implements Calculator {

    @Override
    public int calculateTotal(CoinBundle enteredCoins) {
        return enteredCoins.getTotal();
    }

    @Override
    public CoinBundle calculateChange(int amountMoneyToReturn) {
        CoinBundle change = new CoinBundle(new int[1]);
        int remainingAmount = amountMoneyToReturn;
        change.number1PennyCoins = remainingAmount / Coin.PENNY.getValue();
        remainingAmount = remainingAmount % Coin.PENNY.getValue();

        change.number5NickelCoins = remainingAmount / Coin.NICKEL.getValue();
        remainingAmount = remainingAmount % Coin.NICKEL.getValue();

        change.number10DimeCoins = remainingAmount / Coin.DIME.getValue();
        remainingAmount = remainingAmount % Coin.DIME.getValue();

        change.number25QuarterCoins = remainingAmount / Coin.QUARTER.getValue();
        remainingAmount = remainingAmount % Coin.QUARTER.getValue();

        return change;
    }
}
