
public class ClientGoodbye extends AtmOperation{

    public ClientGoodbye(Context operationContext) {
        super(operationContext);
    }

    @Override
    public boolean doOperation(){
        Context operationContext;
        operationContext.getATM().expelCreditCard(0);
        System.out.println("Gracias y hasta la próxima");

        return true;

    }


}
