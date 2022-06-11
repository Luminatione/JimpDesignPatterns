package designPatterns.chainOfResponsibility;

public abstract class Pipe {
    private Pipe next;
    protected abstract void action(int a);

    public void process(int a)
    {
        action(a);
        if(next != null)
        {
            next.action(a);
        }
    }

    public Pipe addNext(Pipe pipe)
    {
        Pipe current = this;
        while (current.next != null)
        {
            current = current.next;
        }
        current.next = pipe;
        return pipe;
    }
}
