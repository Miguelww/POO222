import javax.naming.CommunicationException;
import java.util.List;

public class ChangePassword extends TitledOperation{

    public ChangePassword(Context operationContext) {
        super(operationContext);
    }
    @Override
    public boolean doOperation() throws CommunicationException {

        int nuevaContrasena=new ATMNumberCapturer(operationContext.getATM()).capturePassword();
        boolean aceptado= operationContext.getServidor().changePassword(nuevaContrasena, operationContext.getATM().getCardNumber());
        operationContext.getATM().print(List.of(aceptado ? "Contraseña cambiada" : "Cambio de contraseña fallido" ));
        System.out.println("Cambio de contrasseña" + (aceptado ? "Exitoso" : "!!"));
        return aceptado;

    }
    public String getTitle() {
        return "Change Password";
    }
}
