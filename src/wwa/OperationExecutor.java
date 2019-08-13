package wwa;
import java.util.ArrayList;

public class OperationExecutor {
     
    static final ArrayList <Operation> Operations = new ArrayList<>();
     
     static void executeOperation(Operation operation) {
        Operations.add(operation);
        operation.execute();
    }
}
          
