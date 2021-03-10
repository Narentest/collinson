package source;

import source.CoinBundle;

public interface VendingMachineController {

    CoinBundle calculateChange(VendingMachineRequest request);
}
