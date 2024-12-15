import java.util.List;

public class AccountBalance extends TitledOperation{
    public AccountBalance(Context operationContext) {
        super(operationContext);
    }

    @Override
    public String getTitle(){
        return "Account Balance";
    }
    @Override
    public boolean doOperation() {
        int balance = operationContext.getServidor().avaiable(operationContext.getATM().getCardNumber());
        operationContext.getATM().print(List.of("Ingresos actuales:" + balance));
        return true;
    }
}
