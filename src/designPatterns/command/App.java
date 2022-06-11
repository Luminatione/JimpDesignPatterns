package designPatterns.command;

import java.util.Stack;

public class App {
    Stack<Command> commands;

    public void executeCommand(Command command)
    {
        commands.push(command);
        command.action();
    }
    public void undo()
    {
        commands.pop().undo();
    }
}
