package wwa;

public class ExitGame implements Operation {
     
    private Option option;
    public ExitGame() {
    	//option musste noch initialisiert werden
    	option = new Option();
    }
         
    @Override
    public void execute() {
        option.exit();
    }
}



