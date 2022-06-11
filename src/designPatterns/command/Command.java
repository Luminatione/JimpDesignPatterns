package designPatterns.command;

public abstract class Command {
    int actionContext;
    public abstract void action();
    public abstract void undo();
}
