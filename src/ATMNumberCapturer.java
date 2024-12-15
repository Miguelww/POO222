import sienens.ATM;

public class ATMNumberCapturer {
    private ATM atm;
    public int captureAmount(){
        return atm.waitEvent(0);

    }
    public int capturePassword(){
        return atm.waitEvent(0);

    }
}
