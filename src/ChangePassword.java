import javax.naming.CommunicationException;
import java.util.List;

public class ChangePassword extends TitledOperation{

    public ChangePassword(Context operationContext) {
        super(operationContext);
    }
    @Override
    public boolean doOperation() throws CommunicationException {
        Context operationContext;

        int nuevaContraseña=new ATMNumberCapturer(operationContext.getAtm()).capturePassword();
        boolean aceptado= operationContext.getServidor().changePassword(nuevaContraseña, operationContext.getATM().getCardNumber());
        operationContext.getATM().print(List.of(aceptado ? "Contraseña cambiada" : "Cambio de contraseña fallido" ));
        return aceptado;

    }
    public String getTitle() {
        return "Change Password";
    }
}
