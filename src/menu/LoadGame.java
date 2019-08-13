package menu;

public class LoadGame implements Operation {
     
    private Option option;
    public LoadGame() {
      //option musste noch initialisiert werden
      option = new Option();
    }
         
    @Override
    public void execute() {
        option.load();
    }
}
