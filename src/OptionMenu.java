import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;


public class OptionMenu extends AtmOperation{
    private List<AtmOperation> operationList;
    public OptionMenu(Context operationContext) {
        super();
        operationList = new ArrayList<AtmOperation>();
    }

    public boolean doOperation() {
    }

}
