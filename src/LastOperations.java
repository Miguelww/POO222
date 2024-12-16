import javax.naming.CommunicationException;
import java.util.List;

public class LastOperations extends TitledOperation{
    public LastOperations(Context operationContext) {
        super(operationContext);

    }

    @Override
    public boolean doOperation() throws CommunicationException {
        List<String> operations = operationContext.getServidor().getLastOperations(operationContext.getATM().getCardNumber());
        operationContext.getATM().print(operations);
        return true;

    }
    public String getTitle() {
        return "Last Operations";
    }
}
