package main.java.logic;

/**
*Command Class - defines properties of command
*/
public class Struct_Command{
    //add more once gameplay design is established
    enum COMMAND{
        MOVE,
        ATTACK,
        DEFEND,
        QUIT;
    }
    
    public COMMAND commandFunc;
    public string[] commandArgs;
    public int numArgs;

    public Struct_Command(){}
}