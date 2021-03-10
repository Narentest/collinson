package source;


import source.Calculator;
import source.CoinBundle;
import source.SimpleCalculator;

public class SimpleVendingMachineController implements VendingMachineController {

    private Calculator calculator = new SimpleCalculator();

    @Override
    public CoinBundle calculateChange(VendingMachineRequest request) {
        int total = calculator.calculateTotal(request.enteredCoins);
        int totalChange = total - request.product.getPrice();
        return calculator.calculateChange(totalChange);
    }

}
