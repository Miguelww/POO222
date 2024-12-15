import sienens.ATM;
import urjc.UrjcBankServer;

public class OperationContext {
    private ATM atm;
    private UrjcBankServer server;
    private String idiom;

    public OperationContext(ATM atm, UrjcBankServer server, String idiom) {
        this.atm = atm;
        this.server = server;
        this.idiom = idiom;

    }

    public UrjcBankServer getServer() {
    }
    public ATM getAtm() {

    }
    public String getIdiom() {

    }
    public void setIdiom(String idiom) {

    }
}
