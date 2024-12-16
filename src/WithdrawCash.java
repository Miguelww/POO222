import sienens.ATM;

import java.io.BufferedReader;
import java.util.List;


public class WithdrawCash extends TitledOperation{

    public WithdrawCash(Context operationContext) {
        super(operationContext);
    }
    @Override
    public String getTitle() {
        return "Withdraw Cash";
    }

    @Override
    public boolean doOperation() {
        int cantidad=new ATMNumberCapturer(operationContext.getATM()).captureAmount();
        if(operationContext.getATM().hasAmount(cantidad)){
            operationContext.getATM().expelAmount(cantidad,1);
            operationContext.getATM().print(List.of("Cantidad retirada: " + cantidad));
            System.out.println("Operacion de retirada exitosa");
            return true;

        } else {
            operationContext.getATM().print(List.of("Cantidad insuficiente: "));
            System.out.println("Operacion de retirada fallida");

            return false;
        }

    }
}
