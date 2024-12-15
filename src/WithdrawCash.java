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
        Context operationContext=new Context();
        int cantidad=new ATMNumberCapturer(operationContext.getATM()).captureAmount();
        if(operationContext.getATM().hasAmount(cantidad)){
            operationContext.getATM().expelAmount(cantidad,1);
            operationContext.getATM().print(List.of("Cantidad devuelta: " + cantidad));
            return true;

        } else {
            operationContext.getATM().print(List.of("Cantidad insuficiente: "));
            return false;
        }

    }
}
