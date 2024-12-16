import javax.naming.CommunicationException;
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
    public boolean doOperation() throws CommunicationException {
        System.out.println("Operacion iniciada");
        int balance = operationContext.getServidor().avaiable(operationContext.getATM().getCardNumber());
        operationContext.getATM().print(List.of("Ingresos actuales:" + balance));
        return true;
    }
}
