import javax.naming.CommunicationException;

public abstract class AtmOperation {
    protected Context operationContext;

    public AtmOperation(Context operationContext) {
        this.operationContext = operationContext;
    }
    public abstract boolean doOperation() throws CommunicationException;

}
