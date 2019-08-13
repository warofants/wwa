package wwa;

public class StartGame implements Operation {
 
    private Option option;
     
    // constructors
     
    @Override
    public void execute() {
        
        option.start();
        
    }
}

