package wwa;

public class ExitGame implements Operation {
     
    private Option option;
         
    @Override
    public void execute() {
        option.exit();
    }
}



