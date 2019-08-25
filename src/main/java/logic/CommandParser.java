package main.java.logic;

/**
 * Split Command
 * Takes input string and returns enum command
 */
public class CommandParser{
    public void CommandParser(){}

    public Struct_Command parseCommand(string order_in){

        if (order_in.isEmpty("") || order_in.isEmpty(nullString)) {
            throw new IllegalArgumentException("Input cannot be Null or Empty!");
        }

        //set fields of the command struct
        Struct_Command command = new Struct_Command();
        command.commandArgs = order_in.Split(" ", 10);
        command.command = command.commandArgs[0];
        command.numArgs = commandArgs.length;
        return command;
    }
}
